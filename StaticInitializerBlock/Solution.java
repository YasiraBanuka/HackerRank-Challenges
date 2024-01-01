import java.util.Scanner;

// Static initialization blocks are executed when the class is loaded, and you can initialize static variables in those blocks.

// It's time to test your knowledge of Static initialization blocks. You can read about it here.

// You are given a class Solution with a main method. Complete the given code so that it outputs the area of a parallelogram with breadth  and height . You should read the variables from the standard input.

// If  or  , the output should be "java.lang.Exception: Breadth and height must be positive" without quotes.

// Input Format

// There are two lines of input. The first line contains : the breadth of the parallelogram. The next line contains : the height of the parallelogram.

// Constraints
// -100 <= B <= 100
// -100 <= H <= 100

// Output Format

// If both values are greater than zero, then the main method must output the area of the parallelogram. Otherwise, print "java.lang.Exception: Breadth and height must be positive" without quotes.

public class Solution {
    // Declare static variables for breadth, height, and a flag
    static int B;
    static int H;
    static boolean flag;

    // Static initialization block
    static {
        // Create a Scanner object to read input from standard input
        Scanner scanner = new Scanner(System.in);

        // Read the breadth and height from input
        B = scanner.nextInt();
        H = scanner.nextInt();

        // Check if both breadth and height are positive
        if (B > 0 && H > 0) {
            // If positive, set the flag to true
            flag = true;
        } else {
            // If not positive, print an error message and set the flag to false
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            flag = false;
        }

        // Close the Scanner
        scanner.close();
    }

    // Main method
    public static void main(String[] args) {
        // Check the flag before calculating and printing the area
        if (flag) {
            // Calculate the area of the parallelogram
            int area = B * H;

            // Print the area
            System.out.println(area);
        }
    }
}
