package solution_offer15;

public class Solution {
    // you need to treat n as an unsigned value
    public static int hammingWeight(int n) {
        int temp = 1;
        int count = 0;
        for (int i = 1; i <= 32; i++) {
            if ((n&temp)>0){
                count++;
            }
            temp <<=1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(hammingWeight(11));
    }
}