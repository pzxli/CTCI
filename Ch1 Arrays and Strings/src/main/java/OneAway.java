public class OneAway {
    // 1.5 One Away: There are three types of edits that can be performed on strings: insert a character, remove a character, or replace a character.
    // Given two strings, write a function to check if they are one edit (or 0) away

    public static boolean isOneAway(String s1, String s2){
        int len1 = s1.length();
        int len2 = s2.length();

        // If the difference in lengths is greater than 1, the strings cannot be one edit away
        if (Math.abs(len1 - len2) > 1) {
            return false;
        }

        int edits = 0;
        int i = 0, j = 0;
        while (i < len1 && j < len2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (edits == 1) {
                    return false;
                }

                if (len1 > len2) {
                    i++;
                } else if (len2 > len1) {
                    j++;
                } else {
                    i++;
                    j++;
                }

                edits++;
            }
        }

        if (edits == 1 || (edits == 0 && len1 != len2)) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(isOneAway("pale", "ple"));
        System.out.println(isOneAway("pales", "pale"));
        System.out.println(isOneAway("pale", "bale"));
        System.out.println(isOneAway("pale", "bake"));
    }
}
