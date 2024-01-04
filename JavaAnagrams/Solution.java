import java.util.Scanner;

// Two strings, a and b, are called anagrams if they contain all the same characters in the same frequencies. For this challenge, the test is not case-sensitive. For example, the anagrams of CAT are CAT, ACT, tac, TCA, aTC, and CtA.

// Function Description

// Complete the isAnagram function in the editor.

// isAnagram has the following parameters:
// string a: the first string
// string b: the second string

// Returns
// boolean: If a and b are case-insensitive anagrams, return true. Otherwise, return false.

// Input Format
// The first line contains a string a.
// The second line contains a string b.

// Constraints

// 1  <= length(a), length(b) <= 50
// Strings a and b consist of English alphabetic characters.
// The comparison should NOT be case sensitive.

// Sample Input 0

// anagram
// margana

// Sample Output 0

// Anagrams

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Check if the lenghts of both strings are same
        if (a.length() != b.length()) {
            return false;
        }

        // Convert both strings to lowercase to case-sensitive comparison
        a = a.toLowerCase();
        b = b.toLowerCase();

        // Create arrays to store character frequencies
        int[] charCountA = new int[26]; // Assuming only English alphabetic characters
        int[] charCountB = new int[26];

        // Update character frequencies for string A & B
        for (char c : a.toCharArray()) {
            charCountA[c - 'a']++;
        }
        for (char c : b.toCharArray()) {
            charCountB[c - 'a']++;
        }

        // Check if the character frequencies are same for both strings
        for (int i = 0; i < 26; i++) {
            if (charCountA[i] != charCountB[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}