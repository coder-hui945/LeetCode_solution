package test_sort;

import javax.swing.*;

/**
 * @autor huihui
 * @date 2020/11/15 - 20:57
 */
public class InsertSort {//O(n^2)  O(1)   稳定
    public static void main(String[] args) {
        int[] a = {2, 4, 5, 3, 1, 6,9,8,7,10,12,11};
        int[] b = {1};
        InsertSort(a);
        for (int i : a) {
            System.out.println(i);
        }
    }

    public static void InsertSort(int[] nums)
//    {
//        if (nums == null || nums.length < 2) {
//            return;
//        }
//        for (int i = 0; i < nums.length - 1; i++) {
//            //当前值
//            int curr = nums[i + 1];
//            //上一个数的指针
//            int preIndex = i;
//            //在数组中找到一个比当前遍历的数小的第一个数
//            while (preIndex >= 0 && curr < nums[preIndex]) {
//                //把比当前遍历的数大的数字往后移动
//                nums[preIndex + 1] = nums[preIndex];
//                //需要插入的数的下标往前移动
//                preIndex--;
//            }
//            //插入到这个数的后面
//            nums[preIndex + 1] = curr;
//        }
//    }
    {
        for (int i = 1; i < nums.length; i++) {
            int temp = nums[i];
            for (int j = i-1; j >=0  ; j--) {
                if (nums[j]>temp){
                    nums[j+1] = nums[j];
                    nums[j] = temp;
                }else{
                    break;
                }
            }
        }
    }
}
