public class PermutationPalindrome {

    public static boolean isPermutationOfPalindrome(String s) {
        // 1.4 Palindrome Permutation: Given a string, write a function to check if it is a permutation of a palindrome.
        // The palindrome does not need to be limited to just dictionary words. You can ignore casing and non-letter characters

        // Clean up the string by converting all characters to lowercase and removing non-letter characters
        s = s.replaceAll("[^a-zA-Z]", "").toLowerCase();

        // Count the frequency of each letter in the cleaned up string
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        // Check if more than one letter has an odd frequency
        int oddCount = 0;
        for (int count : freq) {
            if (count % 2 != 0) {
                oddCount++;
            }
            if (oddCount > 1) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPermutationOfPalindrome("Tact Coa")); // true
        System.out.println(isPermutationOfPalindrome("A man, a plan, a canal, Panama!")); // true
        System.out.println(isPermutationOfPalindrome("hello")); // false
    }

}