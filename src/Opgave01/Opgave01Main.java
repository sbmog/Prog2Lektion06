package Opgave01;

public class Opgave01Main {
    public static int factorial(int n) {
        if (n<0){
            throw new IllegalArgumentException("n skal være et positivt tal");
        }
        if (n==0){
            return 1;
        }else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(factorial(3));
        System.out.println(factorial(5));
        System.out.println(factorial(0));
        System.out.println(factorial(-1));
    }
}
