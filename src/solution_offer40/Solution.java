package solution_offer40;

class Solution {
    public int sumNums(int n) {
        int res = (int) (Math.pow(n,2)+n);
        return res >> 1;
    }
}