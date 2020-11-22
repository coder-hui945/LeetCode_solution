package solution1486;

class Solution {
    public int xorOperation(int n, int start) {
        int res = 0;
        for (int i = 0; i < n; i++) {
            res = res ^ (start + 2 * i);
        }
        return res;
    }

    public int xorOperation02(int n, int start) {
        if(n == 1){
            return start;
        }
        return (start + 2 * (n - 1)) ^ xorOperation(n - 1, start);
    }

    public static void main(String[] args) {
        System.out.println(0 ^ 2 ^ 4 ^ 6 ^ 8);
    }
}