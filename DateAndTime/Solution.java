import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

// The Calendar class is an abstract class that provides methods for converting between a specific instant in time and a set of calendar fields such as YEAR, MONTH, DAY_OF_MONTH, HOUR, and so on, and for manipulating the calendar fields, such as getting the date of the next week.

// You are given a date. You just need to write the method, getDay(), which returns the day on that date. To simplify your task, we have provided a portion of the code in the editor.

// Example
// month = 8
// day = 14
// year = 2017

// The method should return MONDAY as the day on that date.

// Function Description

// Complete the findDay function in the editor below.

// findDay has the following parameters:

// int: month
// int: day
// int: year
// Returns

// string: the day of the week in capital letters
// Input Format

// A single line of input containing the space separated month, day and year, respectively, in  MM DD YY  format.

// Constraints
// 2000 < year < 3000

// Sample Input
// 08 05 2015

// Sample Output
// WEDNESDAY

// Explanation
// The day on August 5th 2015  was WEDNESDAY.

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        // Create a Calendar instance
        Calendar calendar = Calendar.getInstance();

        // Set the date in the Calendar instance
        // Note: Calendar months are 0-based, so we subtract 1 from the month
        calendar.set(year, month - 1, day);

        // Create a SimpleDateFormat to format the date and get the day of the week
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE", Locale.ENGLISH);

        // Format the date and convert the day to uppercase
        return sdf.format(calendar.getTime()).toUpperCase();
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        // Create BufferedReader and BufferedWriter
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        // Read input: month, day, and year
        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
        int month = Integer.parseInt(firstMultipleInput[0]);
        int day = Integer.parseInt(firstMultipleInput[1]);
        int year = Integer.parseInt(firstMultipleInput[2]);

        // Call the findDay method to get the day of the week
        String res = Result.findDay(month, day, year);

        // Write the result to the output
        bufferedWriter.write(res);
        bufferedWriter.newLine();

        // Close BufferedReader and BufferedWriter
        bufferedReader.close();
        bufferedWriter.close();
    }
}
