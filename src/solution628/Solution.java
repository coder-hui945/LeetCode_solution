package solution628;

class Solution {
    public static  int maximumProduct(int[] nums) {
        int[] res = new int[3];int index = 0;
        for (int i = 0; i < 3; i++) {
            int max = 0;
            for (int j = 0; j < nums.length; j++) {
                if (max < nums[j]){
                    max = nums[j];
                    nums[j] = 0;
                }
            }
            res[index++] = max;
        }
        return res[0]*res[1]*res[2];
    }

    public static void main(String[] args) {
        maximumProduct(new int[]{1,2,3});
    }
}