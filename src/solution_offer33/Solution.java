package solution_offer33;

class Solution {
    public static boolean verifyPostorder(int[] postorder) {
        if (postorder.length==0)return true;
       return  recur(postorder,0,postorder.length-1);
    }
    public static boolean recur(int[] nums,int start,int end){

        if (start >= end)return true;
        int index = start;
        while (index<end&&nums[index]<nums[end]){
            index++;
        }
        if (index<end){
            for (int i = index; i < end; i++) {
                if (nums[i]<nums[end])
                    return false;
            }
        }

        return recur(nums,start,index-1)&&recur(nums,index,end-1);
    }

    public static void main(String[] args) {
        System.out.println(verifyPostorder(new int[]{4, 6, 7, 5}));
    }
}