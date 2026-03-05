package Opgave05;

public class Opgave05Main {
    public static int sfd(int a, int b) {
        if (b == 0) return a;
        return sfd(b, a % b);
    }

    public static void main(String[] args) {
        System.out.println(sfd(48, 18));
        System.out.println(sfd(101, 103));
        System.out.println(sfd(56, 98));
        System.out.println(sfd(36, 24));
        System.out.println(sfd(270, 192));

    }
}
