package Opgave04;

public class Opgave04Main {
    public static String reverse(String s) {
        if (s.length() <= 1) return s;

        return reverse(s.substring(1)) + s.charAt(0);
    }

    public static void main(String[] args) {
        System.out.println(reverse("eirefretniV"));
        System.out.println(reverse("hello"));
        System.out.println(reverse("abcde"));
        System.out.println(reverse("a"));
        System.out.println(reverse(""));

        System.out.println(reverseStringBuilder("eirefretniV"));
    }

    //Sparer tid
    public static String reverseStringBuilder(String s) {
        StringBuilder sb = new StringBuilder(s);
        return reverseHelper(sb, 0, sb.length() - 1);
    }

    private static String reverseHelper(StringBuilder sb, int left, int right) {
        if (left >= right) return sb.toString();

        char temp = sb.charAt(left);
        sb.setCharAt(left, sb.charAt(right));
        sb.setCharAt(right, temp);

        return reverseHelper(sb, left + 1, right - 1);
    }

}
