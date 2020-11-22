package solution_offer57;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i = 0,j = nums.length-1;
        while (i!=j){
            int k = nums[i] + nums[j];
            if(k > target )
                j --;
            if(k < target)
                i ++;
            if(k == target)
                return new int[]{nums[i],nums[j]};
        }
        return null;
    }
}