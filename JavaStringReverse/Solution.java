import java.util.*;

// A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.

// Given a string A, print Yes if it is a palindrome, print No otherwise.

// Constraints
// A will consist at most 50 lower case english letters.

// Sample Input
// madam

// Sample Output
// Yes

public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        sc.close();

        // Check if the string is palindrome
        String result = isPalindrome(A) ? "Yes" : "No";

        // Print the result
        System.out.println(result);  
    }

    // Function to check if a string is a palindrome
    private static boolean isPalindrome(String str) {
        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - 1 -i)) {
                return false; // If characters do not match, it's not a palindrome
            }
        }
        return true; // If all characters match, it's a palindrome
    }
}



