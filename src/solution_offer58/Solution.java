package solution_offer58;

/**
 * @autor huihui
 * @date 2020/11/10 - 20:22
 */
class Solution {
    public static String reverseLeftWords(String s, int n) {
        String s1 = s.substring(0,n);
        String s2 = s.substring(n,s.length());
        return s2 + s1;
    }

    public static void main(String[] args) {
        String s = "abcdefg";
        int k = 2;
        System.out.println(reverseLeftWords(s,k));
    }
}
