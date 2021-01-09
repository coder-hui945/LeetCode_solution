package test_sort;

/**
 * @autor huihui
 * @date 2020/11/15 - 20:57
 */
public class SelectSort {//O(n^2)  O(1)   不稳定
    public static void main(String[] args) {
        int[] a = {2, 4, 5, 3, 1, 6,9,8,7,10,12,11};
        int[] b = {1};
        SelectSort(a);
        for (int i : a) {
            System.out.println(i);
        }
    }

    public static void SelectSort(int[] nums)
//    {
//        for (int i = 0; i < nums.length-1; i++) {
//            int minIndex = i;
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[j] < nums[minIndex]) {
//                    minIndex = j;
//                }
//            }
//            if (minIndex != i) {
//                int temp = nums[i];
//                nums[i] = nums[minIndex];
//                nums[minIndex] = temp;
//            }
//        }
//    }
//    {
//        for (int i = 0; i < nums.length; i++) {
//            int minIndex = i;
//            for (int j = i; j < nums.length; j++) {
//                if (nums[j]<nums[minIndex]){
//                    minIndex = j;
//                }
//            }
//            if (minIndex != i){
//                int temp = nums[i];
//                nums[i] = nums[minIndex];
//                nums[minIndex] = temp;
//            }
//        }
//    }
    {
        for (int i = 0; i < nums.length; i++) {
            int minIndex = i;
            for (int j = i; j < nums.length ; j++) {
                if (nums[j]<nums[minIndex])
                    minIndex = j;
            }
            if (minIndex!=i){
                int tmp = nums[i];
                nums[i] = nums[minIndex];
                nums[minIndex] = tmp;

            }
        }
    }
}
