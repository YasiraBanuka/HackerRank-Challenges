import java.util.Scanner;
import java.util.regax.*;

public class Solution {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int textCases = Integer.parseInt(in.nextLine());

    while (testCases > 0) {
      String pattern = in.nextLine();

      try {
        // Try to compile the pattern
        Pattern.compile(pattern);
        System.out.println("Valid");
      } catch (PatternSyntaxExeption e) {
        // Catch the exception if compilation fails
        System.out.println("Invalid");
      }
      testCases--;
    }
  }
}