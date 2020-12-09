package solution_offer14_1;

class Solution {
    public static int cuttingRope(int n) {
        int[] temp = new int[n + 1];
        if (n == 2)return 1;
        if (n==3)return 2;
        temp[0] = 0;
        temp[1] = 1;
        temp[2] = 2;//注意此处的返回值和下面的数组不一样，因为返是必须把这个长度切割，而计算时该长度不用切割，直接代入计算。
        if (n > 2) {
            temp[3] = 3;
            for (int i = 4; i <= n; i++) {
                int max = 0;
                for (int j = 1; j <= i / 2; j++) {
                    if (temp[j] * temp[i - j] > max)
                        max = temp[j] * temp[i - j];
                }
                temp[i] = max;
            }
        }
        return temp[n];
    }

    public static void main(String[] args) {
        System.out.println(cuttingRope(23));
    }
}