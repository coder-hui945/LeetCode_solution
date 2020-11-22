package solution771;

class Solution {
    public int numJewelsInStones(String J, String S) {
        int[] arr = new int['z'-'A'+1];

        int count = 0;
        for (int i = 0; i < S.length(); i++) {
            arr[S.charAt(i) - 'A']++;
        }
        for (int i = 0; i < J.length(); i++) {
            if (arr[J.charAt(i) - 'A'] != 0)
                count += arr[J.charAt(i) - 'A'];

        }

        return count;

    }

    public int numJewelsInStones02(String J, String S) {
        int res = 0;
        // 声明一个58的数组
        char[] chars = new char[58];
        // 与哈希表对比，这里存放在一个数组进行比对
        for (char ch : J.toCharArray()) {
            // 所有字母减去65得出数组下标，并++
            chars[ch - 65]++;
        }
        // 遍历你拥有的石头
        for (char ch : S.toCharArray()) {
            // 如果等于1，说明存在宝石
            if (chars[ch - 65] == 1) {
                res++;
            }
        }
        return res;
    }



    public static void main(String[] args) {
        char a = 'z';
        char A = 'A';
        System.out.println((int) a);//97
        System.out.println((int) A);//65
    }
}