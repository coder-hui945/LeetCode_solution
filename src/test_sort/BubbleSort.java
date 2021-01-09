package test_sort;

/**
 * @autor huihui
 * @date 2020/11/15 - 20:34
 */
public class BubbleSort {       //O(n^2)  O(1)   稳定
    public static void main(String[] args) {
        int[] a = {2, 4, 5, 3, 1, 6,9,8,7,10,12,11};
        int[] b = {1};
        BubbleSort(a);
        for (int i : a) {
            System.out.println(i);
        }
    }

    public static void BubbleSort(int[] nums)
//    {
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
//
//    }
//    {
//        if (nums==null||nums.length<2)return;
//        for (int i = nums.length-1; i > 0 ; i--) {
//            for (int j = 0; j < i; j++) {
//                  if (nums[j]>nums[j+1]){
//                      int temp = nums[j];
//                      nums[j] = nums[j+1];
//                      nums[j+1] = temp;
//                  }
//            }
//        }
//    }
    {
        if(nums==null||nums.length<2)return ;
        for (int i = nums.length-1; i > 0  ; i--) {
            for (int j = 0; j < i; j++) {
                  if(nums[j]>nums[j+1]){
                      int tmp = nums[j];
                      nums[j] = nums[j+1];
                      nums[j+1] = tmp;
                  }
            }
        }
    }

}
