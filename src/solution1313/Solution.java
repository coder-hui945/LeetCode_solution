package solution1313;

class Solution {
    public int[] decompressRLElist(int[] nums) {
        //先循环给定的数据,得到新数组的长度
        int newLen=0;
        for(int i=0;i<nums.length;i+=2){
            newLen+=nums[i];
        }
        //声明新的数组
        int[] newArr=new int[newLen];
        //从0开始给新数组赋值
        int temp=0;
        for(int i=0;i<nums.length;i+=2){
            for(int j=0;j<nums[i];j++){
                newArr[temp++]=nums[i+1];
            }
        }
        return newArr;
    }
}