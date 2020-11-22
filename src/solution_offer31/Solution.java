package solution_offer31;

import java.util.Stack;

class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        if(pushed.length==0||pushed==null)return true;
        int index = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < pushed.length; i++) {
            stack.push(pushed[i]);
            while (!stack.isEmpty()&&stack.peek() == popped[index]){
                stack.pop();
                index ++;
            }
        }
        return stack.isEmpty();
    }
}