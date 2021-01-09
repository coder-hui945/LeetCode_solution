package solution_offer39;

class Solution {
    //    public int majorityElement(int[] nums) {
//        sort(nums);
//        return nums[(nums.length+1)/2];
//    }
//    public void sort(int[] nums){
//        if (nums == null || nums.length < 2) {
//            return;
//        }
//        for (int i = 0; i < nums.length - 1; i++) {
//            for (int j = 0; j < nums.length - i - 1; j++) {
//                if (nums[j] > nums[j + 1]) {
//                    int temp = nums[j];
//                    nums[j] = nums[j + 1];
//                    nums[j + 1] = temp;
//                }
//            }
//        }
//    }
    public int majorityElement(int[] nums) {
        int x = 0; int sum = 0;
        for (int num : nums) {
            if (sum==0)x = num;
            sum += num==x?1:-1;
        }
        return x;

    }

}