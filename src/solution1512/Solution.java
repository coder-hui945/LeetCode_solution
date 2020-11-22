
package solution1512;

class Solution {
    public int numIdenticalPairs(int[] nums) {
         int count = 0;
         int length = nums.length;
         if(length >= 2){
             for (int i = 0; i < length - 1; i++) {
                 for(int j  = i+1; j < length;j++ )
                     if (nums[i] == nums[j])
                         count ++;
             }
         }
        return count;
    }


    public int numIdenticalPairs02(int[] nums) {
        int[] cnt = new int[101];
        int ans = 0;
        for (int num : nums) {
            ans += cnt[num];
            cnt[num]++;
        }
        return ans;
    }
}