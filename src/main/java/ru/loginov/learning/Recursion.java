package ru.loginov.learning;

public class Recursion {

    public static void main(String[] args) {
        //factorial(6) = 1 * 2 * 3 * 4 * 5 * 6 = 720
        System.out.println(recursionFactorial(6));
    }

    //factorial(n) = 1 * 2 * 3 * .. * (n-1) * n
    static int loopFactorial(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    //factorial(n)   = 1 * 2 * 3 * .. * (n-1) * n
    //factorial(n-1) = 1 * 2 * 3 * .. * (n-1)
    //factorial(n) = factorial(n-1) * n  , factorial(1) = 1

    static int recursionFactorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            int factnm1 = recursionFactorial(n - 1);
            return factnm1 * n;
        }
    }


}
