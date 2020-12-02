package solution_offer10;

class Solution {
    public static int fib(int n) {//数组加循环实现，也可以定义变量释放数组空间来实现。
        if (n == 0) return 0;
        if (n == 1) return 1;
        int[] res = new int[n + 1];
        res[0] = 0;
        res[1] = 1;
        for (int i = 2; i < n + 1; i++) {
            res[i] = (res[i - 1] + res[i - 2]) % 1000000007;
        }
        return res[n];
    }

    public int fib2(int n) {
        int a = 0, b = 1, sum = 0;
        if (n == 0) return 0;
        if (n == 1) return 1;
        for (int i = 1; i < n; i++) {
            sum = (a + b) % 1000000007;
            a = b;
            b = sum;
        }
        return sum;
    }

    public static int fib3(int n) {//递归实现斐波那契数列
       return  recur(n);
    }

    public static int recur(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return recur(n-1)+recur(n-2);
    }

    public static void main(String[] args) {
        System.out.println(fib3(43));
        System.out.println(fib(43));
    }
}