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
        Boolean str = isUnique("helo");
        Boolean str2 = isUnique("hello");
        Boolean str3 = isUnique("aAbc");
        Boolean str4 = isUnique("aAabc");
        Boolean str5 = isUnique("abb");
        Boolean str6 = isUnique("abc");
        Boolean str7 = isUnique("abc0");
        Boolean str8 = isUnique("abc00");
        System.out.println(str);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str5);
        System.out.println(str6);
        System.out.println(str7);
        System.out.println(str8);
    }
}
