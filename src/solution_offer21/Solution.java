package solution_offer21;

class Solution {
    public static int[] exchange(int[] nums) {
//        if (nums.length == 1)
//            return nums;
//        int i = 0, j = nums.length - 1;
//        while (i < j){
//            while (nums[i]%2 != 0 && i < j)
//                i ++;
//            while (nums[j]%2 != 1 && j > i)
//                j --;
//            int temp = nums[i];
//            nums[i] = nums[j];
//            nums[j] = temp;
//            i ++;j --;
//        }
//        return nums;
        if (nums.length ==1 ) return nums;
        int left = 0,right = nums.length-1;
        while (left < right){
            while (left < right&&(nums[left]%2)!=0){
                left++;
            }
            while (left < right&&(nums[right]%2)==0){
                right --;
            }
            if (left<right){
                int tmp = nums[left];
                nums[left] = nums[right];
                nums[right] = tmp;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        exchange(nums);
        System.out.println("888");
    }
}