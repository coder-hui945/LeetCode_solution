package solution_offer11;

import sun.security.util.Length;

class Solution {//旋转数组的最小数字
    public static int minArray(int[] numbers) {

        if (numbers[numbers.length-1]>numbers[0])return numbers[0];
        int i = 0,j = numbers.length-1;
        int mid = (i+j)/2;
        if(numbers[i]==numbers[j]&&numbers[i]==numbers[mid])return minOrder(numbers);
        while(i!=j-1){
            mid = (i+j)/2;
            if(numbers[mid]>=numbers[i])
                i = mid;
           else if(numbers[mid]<=numbers[i])
                j = mid;
        }
        return numbers[j];
    }
    static int minOrder(int[] numbers){
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]<min)
                min = numbers[i];
        }
        return min;
    }


    public static void main(String[] args) {
        minArray(new int[]{2,2,2,0,1});
    }
}