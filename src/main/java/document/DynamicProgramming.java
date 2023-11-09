package document;

public class DynamicProgramming {

    public static void main(String[] args) {
        System.out.println(fibo(3));
    }
    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static long[] memo = new long[100];

    public static long fibo(int num) {
        if (num == 0 || num == 1) {
            return num;
        }
        else if (memo[num] != 0) {
            return memo[num];
        }
        else{
            memo[num] = fibo(num - 2) + fibo(num - 1);
            return memo[num];
        }
    }
}
