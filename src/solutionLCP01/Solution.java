package solutionLCP01;

import java.util.Stack;

class Solution {
    public static int game(int[] guess, int[] answer) {
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> stack1 = new Stack<>();//初始化

        int res = 0;
        for (int i = 0; i < guess.length; i++) {
            stack.push(guess[i]);
        }
        for (int i = 0; i < answer.length; i++) {
            stack1.push(answer[i]);
        }
        while (stack.size() != 0){//size
            if (stack.pop() == stack1.pop())
                res ++;
        }
        return res;

    }
    public int game02(int[] guess, int[] answer) {
        int res = 0;
        for (int i = 0; i < 3; i++) {
            if (guess[i] == answer[i])
                res ++;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3};
        int[] b = {1,2,3};
        System.out.println(game(a, b));
//        Stack<Integer> stack = new Stack<>();
//        stack.push(1);
//        System.out.println(stack);
    }
}