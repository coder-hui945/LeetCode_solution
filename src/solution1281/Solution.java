package solution1281;

class Solution {
    public static int subtractProductAndSum(int n) {
        String m = n + "";
        int length = m.length();
        int ji = 1;
        int sum = 0;
        if(length != 0){
             ji = 1;
            for (int i = 0; i < length; i++) {
                ji *=(m.charAt(i)-48);
                sum +=(m.charAt(i)-48);
            }
        }
        return ji-sum;
    }
    public int subtractProductAndSum2(int n) {
        int muti = 1;
        int sum = 0;
        while(n!=0){
            muti *=n%10;
            sum +=n%10;
            n/=10;
        }
        return muti-sum;


    }


    public static void main(String[] args) {
        subtractProductAndSum(234);
        System.out.println('0');
    }
}