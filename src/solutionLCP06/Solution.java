package solutionLCP06;

class Solution {
    public int minCount(int[] coins) {
        int count = 0;
        for (int i = 0; i < coins.length; i++) {
            count += coins[i]/2;
            if (coins[i]%2 != 0)
                count ++;
        }
        return count;
    }
    public static int minCount2(int[] coins) {
        int res=0;
        for(int i :coins){
            res+=((i>>1)+i%2);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(minCount2(new int[]{4,2,1}));
    }
}