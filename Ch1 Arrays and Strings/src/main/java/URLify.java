import java.util.Arrays;

public class URLify {
    public static String uRLd (String a, int length){
        String word = a.substring(0, length);
        String add = "%20";

        word = word.replace(" ", add);

        return word;
    }

    public static void main(String[] args){
        String a = "Paul Li  ";
        int length = 7;
        System.out.println(uRLd(a, length));
    }

}
