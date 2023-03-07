public class UniqueString {
    // 1.1 Is Unique: Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structures?

    public static boolean isUnique(String s) {
        if (s == null) {
            return false;
        }

        for (int i = 0; i < s.length(); i++){
            for (int j = i + 1; j < s.length(); j++) {
                if(s.charAt(i) == s.charAt(j)){
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isUnique("helo"));
        System.out.println(isUnique("hello"));
        System.out.println(isUnique("aAbc"));
        System.out.println(isUnique("aAabc"));
        System.out.println(isUnique("abc"));
        System.out.println(isUnique("abc0"));
        System.out.println(isUnique("abc00"));
    }
}
