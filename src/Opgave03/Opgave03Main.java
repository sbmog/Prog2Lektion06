package Opgave03;

public class Opgave03Main {
    public static int power(int n, int p) {
        if (p == 0) return 1;
        if (p % 2 == 0) {
            int half = power(n, p / 2);
            return half * half;
        } else {
            return (power(n, p - 1)) * n;
        }
    }

    public static void main(String[] args) {
        System.out.println(power(2, 3));
        System.out.println(power(5, 0));
        System.out.println(power(3, 4));
        System.out.println(power(10, 2));
        System.out.println(power(2, 10));

    }
}
