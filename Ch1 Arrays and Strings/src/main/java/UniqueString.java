public class UniqueString {
    public static boolean isUnique(String s) {
        if (s == null) {
            return false;
        }
        int i = 0;
        while (i < (s.length()-1)) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                return false;
            } else {
                i++;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Boolean str = isUnique("helo");
        Boolean str2 = isUnique("aAbc");
        Boolean str3 = isUnique("abb");
        Boolean str4 = isUnique("abc");
        Boolean str5 = isUnique("abc0");
        System.out.println(str);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str5);
    }
}
