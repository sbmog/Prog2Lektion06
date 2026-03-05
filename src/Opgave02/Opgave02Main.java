package Opgave02;

public class Opgave02Main {

    public static int fibonacci(int n) {
        int[] results = new int[n + 1];
        return fibonacciHelper(n, results);
    }

    public static int fibonacciHelper(int n, int[] results) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (results[n] != 0) return results[n];
        results[n] = fibonacciHelper(n - 1, results) + fibonacciHelper(n - 2, results);
        return results[n];
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(10));
    }
}
