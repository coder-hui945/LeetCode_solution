package solution_offer13;

class Solution {
    public int movingCount(int m, int n, int k) {
        return 0;
    }
    int sum(int num){
        int s = 0;
        while(num!=0){
            s += (num%10);
            num /=10;
        }
        return s;
    }
}