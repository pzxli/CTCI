import java.util.Arrays;

public class Permutation {
    public static boolean isPermutation (String a, String b){
        int s1 = a.length();
        int s2 = b.length();

        if (s1 != s2){
            return false;
        }

        char t1[] = a.toCharArray();
        char t2[] = b.toCharArray();

        Arrays.sort(t1);
        Arrays.sort(t2);

        for (int i = 0; i < s1; i++){
            if(t1[i] != t2[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String x = "this";
        String y = "shit";

        String c = "no";
        String d = "yes";
        System.out.println(isPermutation(x, y));
        System.out.println(isPermutation(c, d));

    }
}
