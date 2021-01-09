package test_sort;

import com.sun.xml.internal.bind.v2.model.annotation.Quick;

import java.util.Queue;

/**
 * @autor huihui
 * @date 2020/11/15 - 20:57
 */
public class QuickSort {//O(nlogn)  O(1)   不稳定

    public static void main(String[] args) {
        int[] a = {2, 4, 5, 3, 1, 6, 9, 8, 7,1,2, 10,12,11,13};
        int[] b = {1};
        sort(a);
        for (int i : a) {
            System.out.println(i);
        }
    }

    protected static void sort(int[] nums) {
        if (nums == null || nums.length < 2) {
            return;
        }
        QuickSort(nums, 0, nums.length - 1);
    }

    public static void QuickSort(int[] nums, int star, int end)
//    {
//        if (star >= end) {
//            return;
//        }
//        int i = star;
//        int j = end;
//        int key = nums[star];
//        while (i < j) {
//            while (i < j && nums[j] > key) {
//                j--;
//            }
//            while (i < j && nums[i] <= key) {
//                i++;
//            }
//            if (i < j) {
//                int temp = nums[i];
//                nums[i] = nums[j];
//                nums[j] = temp;
//            }
//        }
//        nums[star] = nums[i];
//        nums[i] = key;
//        QuickSort(nums, star, i - 1);
//        QuickSort(nums, i + 1, end);
//    }
    {
        if(star>=end)return;
        int i =star,j = end;
        int key = nums[star];
        while (i<j){
            while (i<j&&nums[j]>key)j--;
            while (i<j&&nums[i]<=key)i++;
            if(i<j){
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
            }
        }
        nums[star] = nums[i];
        nums[i] = key;
        QuickSort(nums,star,i-1);
        QuickSort(nums,i+1,end);

    }
}
