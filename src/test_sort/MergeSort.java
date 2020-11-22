package test_sort;

/**
 * @autor huihui
 * @date 2020/11/15 - 20:57
 */
public class MergeSort {//O(nlogn)  O(n)   稳定 归并排序

    public static void main(String[] args) {
        int[] a = {2, 4, 5, 3, 1, 6, 9, 8, 7, 10};
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
        //归并排序
        mergeSort(0, nums.length - 1, nums, new int[nums.length]);
    }

    private static void mergeSort(int star, int end, int[] nums, int[] temp) {
        //递归终止条件
        if (star >= end) {
            return;
        }
        int mid = star + (end - star) / 2;
        //左边进行归并排序
        mergeSort(star, mid, nums, temp);
        //右边进行归并排序
        mergeSort(mid + 1, end, nums, temp);
        //合并左右
        merge(star, end, mid, nums, temp);
    }

    private static void merge(int star, int end, int mid, int[] nums, int[] temp) {
        int index = 0;
        int i = star;
        int j = mid + 1;
        while (i <= mid && j <= end) {
            if (nums[i] > nums[j]) {
                temp[index++] = nums[j++];
            } else {
                temp[index++] = nums[i++];
            }
        }
        while (i <= mid) {
            temp[index++] = nums[i++];
        }
        while (j <= end) {
            temp[index++] = nums[j++];
        }
        //把临时数组中已排序的数复制到nums数组中
        if (index >= 0) System.arraycopy(temp, 0, nums, star, index);
    }
}
