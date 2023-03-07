public class StringCompression {
    // 1.6 String Compression: Implement a method to perform basic string compression using the counts of repeated characters. For example, the string aabcccccaaa would become a2b1c5a3.
    // if the "compressed" string would not become smaller than the original string, your method should return the original string. You can assume the string has only uppercase and lowercase letters (a-z)

    public static String stringCompression(String str){
        if (str == null || str.length() <= 1) {
            return str;
        }

        str = str.toLowerCase(); // Convert input string to lowercase
        char prevChar = str.charAt(0);
        int count = 1;
        StringBuilder compressed = new StringBuilder();

        for (int i = 1; i < str.length(); i++) {
            char currChar = str.charAt(i);

            if (currChar == prevChar) {
                count++;
            } else {
                compressed.append(prevChar).append(count);
                count = 1;
                prevChar = currChar;
            }
        }

        compressed.append(prevChar).append(count);

        if (compressed.length() >= str.length()) {
            return str;
        } else {
            return compressed.toString();
        }
    }

    public static void main(String[] args) {
        System.out.println(stringCompression("aabcccccaaa"));
        System.out.println(stringCompression("abcd"));
        System.out.println(stringCompression("aaa"));
        System.out.println(stringCompression("aaaaabbbbcccdd"));
    }
}
