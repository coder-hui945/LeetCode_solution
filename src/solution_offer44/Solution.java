package solution_offer44;

class Solution {
    public static int findNthDigit(int n) {
        if (n<0)return -1;
        int digits = 1;
        while (true){
            int countOfNumbers = countOfNumbersFor(digits)*digits;
            if (n<countOfNumbers){
                return findAtIndex(n,digits);
            }else {
                n-=countOfNumbers;
                digits++;
            }
        }

    }

    private static int findAtIndex(int n, int digits) {
//        int ind1 = n/digits;
//        int ind2 = n%digits;
//        int beginNumber = beginNumberFor(digits);
//        String res = (beginNumber+ind1+1)+"";
//        char[] chars = res.toCharArray();
//        int value = chars[ind2] - '0';
//        return value;

        //对应的数值
        int number = beginNumberFor(digits) + n / digits;
        //从数值右边开始算的位置
        int indexFromRight = digits - n % digits;
        //去除右边的indexFromRight-1个数字
        for (int i = 1; i < indexFromRight; i++)
            number /= 10;
        //求个位数字
        return number % 10;


    }
    public static int beginNumberFor(int digits){
        if (digits == 1)
            return 0;

        return (int) Math.pow(10, digits - 1);
    }

    public static int countOfNumbersFor(int digits){
        if (digits == 1)
            return 10;

        int count = (int) Math.pow(10, digits - 1);
        return 9 * count;
    }

    public static void main(String[] args) {

        System.out.println(findNthDigit(1000000000));

    }
}