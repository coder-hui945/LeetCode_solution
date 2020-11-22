package solution_offer56_1;

class Solution {
    public int[] singleNumbers(int[] nums) {
        int res = 0;
        for (int num : nums) {
            res ^= num;
        }
        int index = 1;
        while ((index&res) == 0){
            index <<=1;
        }
        int a= 0,b = 0;
        for (int num : nums) {
            if ((num&index)== 0)
                a ^=num;
            else
                b ^= num;
        }
        return new int[]{a,b};

    }
}