package solution_offer10_2;

class Solution {//青蛙跳台阶问题
    public int numWays(int n) {
        int a = 1;
        int b = 1;
        int sum = 0;
        if (n==0)return a;
        if (n==1)return b;
        for (int i = 2; i <= n ; i++) {
            sum = (a+b)%1000000007;
            a = b;
            b = sum;
        }
        return sum;
    }
}