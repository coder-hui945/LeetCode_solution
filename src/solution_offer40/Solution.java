package solution_offer40;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/*
*         topK问题
* */
class Solution {
    public int[] getLeastNumbers(int[] arr, int k) {
        Arrays.sort(arr);
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = arr[i];
        }
        return res;
    }

    public int[] getLeastNumbers2(int[] arr, int k) {
//        int[] res = new int[k];
//        if (k==0) return res;
//        PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2-o1;
//            }
//        });
//        for (int i = 0; i < k; i++) {
//            queue.offer(arr[i]);
//        }
//        for (int i = k; i <arr.length ; i++) {
//            if (queue.peek()>arr[i]){
//                queue.poll();
//                queue.offer(arr[i]);
//
//            }
//        }
//        for (int i = 0; i < k; i++) {
//            res[i] = queue.poll();
//        }
//        return res;
        int[] res = new int[k];
        if (k==0)return res;
        PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        for (int i = 0; i < k; i++) {
            queue.offer(arr[i]);
        }
        for (int i = k; i < arr.length; i++) {
            if (queue.peek()>arr[i]){
                queue.poll();
                queue.offer(arr[i]);
            }
        }
        for (int i = 0; i < k; i++) {
            res[i] = queue.poll();
        }
        return res;
    }


    }