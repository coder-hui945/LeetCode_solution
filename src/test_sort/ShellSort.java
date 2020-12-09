package test_sort;

/**
 * @autor huihui
 * @date 2020/11/15 - 20:57
 */
public class ShellSort {//O(nlog2n)  O(1)   稳定

    public static void main(String[] args) {
        int[] a = {2, 4, 5, 3, 1, 6, 9, 8, 7, 10, 12, 11};
        int[] b = {1};
        ShellSort(a);
        for (int i : a) {
            System.out.println(i);
        }
    }

    public static void ShellSort(int[] nums)
//    {
//        if (nums == null || nums.length < 2) {
//            return;
//        }
//        int length = nums.length;
//        int temp;
//        //步长
//        int gap = length / 2;
//        //插入排序
//        while (gap > 0) {
//            for (int i = gap; i < length; i++) {
//                temp = nums[i];
//                int preIndex = i - gap;
//                while (preIndex >= 0 && nums[preIndex] > temp) {
//                    nums[preIndex + gap] = nums[preIndex];
//                    preIndex -= gap;
//                }
//                nums[preIndex + gap] = temp;
//            }
//            gap /= 2;
//        }
//    }
    {
        if(nums==null||nums.length<2)return;
        int length = nums.length;
        int grap = length/2;
        while (grap>0){
            for (int i = grap; i < length; i++) {
                int temp = nums[i];
                for (int j = i-grap; j >=0 ; j-=grap) {
                    if (nums[j]>temp){
                        nums[j+grap] = nums[j];
                        nums[j] = temp;
                    }else {
                        break;
                    }
                }
            }
            grap /= 2;
        }

    }

}
