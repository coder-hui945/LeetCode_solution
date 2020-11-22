package solutionLCP17;

class Solution {
    public int calculate(String s) {
        int x = 1;int y = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'A')
                x = x*2 + y;
            if(s.charAt(i) == 'B')
                y = 2*y + x;
        }
        return x + y;

    }
    class Solution2 {
        public int calculate(String s) {
            return 1<<s.length();
        }
    }
}