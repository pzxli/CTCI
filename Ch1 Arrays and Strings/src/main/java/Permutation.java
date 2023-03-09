import java.util.Arrays;

public class Permutation {
    // 1.2 Check Permutation: Given two strings, write a method to decide if one is a permutation of the other

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
        System.out.println(isPermutation("this", "shit"));
        System.out.println(isPermutation("no", "yes"));
    }
}
