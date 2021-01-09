package solution_offer44;

/**
 * @autor huihui
 * @date 2020/12/27 - 9:24
 */
public class solution3 {
    public static int findNthDigit(int n) {
        int start = 1;
        long digit = 1;
        long count = 9;
        while (n > count) {
            n -= count;
            digit++;
            start *= 10;
            count = start * digit * 9;
        }
        long num = start + (n - 1) / digit;
        return Long.toString(num).charAt((int) ((n - 1) % digit)) - '0';
    }

    public static void main(String[] args) {
        System.out.println(findNthDigit(1000000000));
//        for (int i = 0; i < 50; i++) {
//            System.out.print(findNthDigit(i) + "\t");
//        }
    }

}
