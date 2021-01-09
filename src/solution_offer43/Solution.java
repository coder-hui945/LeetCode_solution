package solution_offer43;

class Solution {
    public static int countDigitOne1(int n) {
        int count = 0;
        for (int i = 0; i <=n; i++) {
            int num = i;
            while (num!=0){
                if (num%10==1){
                    count++;
                }
                num=num/10;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countDigitOne1(12));
    }
}