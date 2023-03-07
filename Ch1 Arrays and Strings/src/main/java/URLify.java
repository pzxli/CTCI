import java.util.Arrays;

public class URLify {
    // 1.3 URLify: Write a method to replace all spaces in a string with '%20'.
    // You may assume that the string has sufficient space at the end to hold the additional characters, and that you are given the "true" length of the string

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
