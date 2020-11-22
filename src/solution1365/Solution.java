package solution1365;

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] kk = new int[102];
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            kk[nums[i]] ++;
        }
        for (int i=0;i<nums.length;i++) {
            for (int j = 0; j < nums[i]; j++) {
                res[i] += kk[j];
            }
        }
        return res;
    }
    public int[] smallerNumbersThanCurrent2(int[] nums) {
        int[] arrays = new int[101];
        for (int num : nums)
            arrays[num] += 1;
        for (int i = 1; i < arrays.length; i++)
            arrays[i] += arrays[i - 1];
        for (int i = 0; i < nums.length; i++)
            nums[i] = nums[i] != 0 ? arrays[nums[i] - 1] : 0;
        return nums;
    }

}