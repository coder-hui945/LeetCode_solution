package solution_offer31;

import java.util.Stack;

class Solution {
    public static boolean validateStackSequences(int[] pushed, int[] popped)
//    {
//        if(pushed.length==0||pushed==null)return true;
//        int index = 0;
//        Stack<Integer> stack = new Stack<>();
//        for (int i = 0; i < pushed.length; i++) {
//            stack.push(pushed[i]);
//            while (!stack.isEmpty()&&stack.peek() == popped[index]){
//                stack.pop();
//                index ++;
//            }
//        }
//        return stack.isEmpty();
//    }
    {
        Stack<Integer> stack = new Stack<>();
        int x = 0;
        for (int num : pushed) {
            stack.push(num);
            while (!stack.isEmpty()&&stack.peek()==popped[x]){
                stack.pop();
                x++;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(validateStackSequences(new int[]{1, 2, 3, 4, 5}, new int[]{4, 5, 3, 2, 1}));
    }
}