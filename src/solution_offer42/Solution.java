package solution_offer42;

import java.util.concurrent.ForkJoinPool;

class Solution {
    public static int maxSubArray1(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int sum = 0;
                for (int k = i; k <= j  ; k++) {
                     sum = sum+nums[k];
                }

                if (sum>res)
                    res = sum;
            }
        }
        return res;
    }
    public static int maxSubArray2(int[] nums) {
        if (nums==null||nums.length==0)return 0;
        int sum = 0;
        int res = nums[0];
        for (int num : nums) {
            sum = sum>0?sum+num:num;
            res = Math.max(sum,res);
        }
        return res;
    }
    public static int maxSubArray3(int[] nums) {
        if (nums==null||nums.length==0)return 0;
        int max = -9999999 ;
        for (int i = 0; i < nums.length; i++) {
            int sum=0;
            for (int j = i; j < nums.length; j++) {
                  sum +=  nums[j];
                  if (sum>max)
                      max = sum;
            }
        }
        return max;
    }
    public static int maxSubArray4(int[] nums) {
        if (nums==null||nums.length==0)return 0;
        int sum = nums[0];int max=nums[0];
        for (int i = 1; i < nums.length; i++) {
            sum=sum>0?sum+nums[i]:nums[i];
            if (sum>max)
                max=sum;
        }
        return max;
    }



        public static void main(String[] args) {
        int[] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray1(nums));
        System.out.println(maxSubArray2(nums));
        System.out.println(maxSubArray3(nums));
        System.out.println(maxSubArray4(nums));

    }

}