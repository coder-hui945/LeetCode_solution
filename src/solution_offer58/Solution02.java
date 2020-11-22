package solution_offer58;

import sun.text.normalizer.CharTrie;

/**
 * @autor huihui
 * @date 2020/11/10 - 20:30
 */
public class Solution02 {
    public static String reverseLeftWords(String s, int n) {
        char[] s1 = new char[s.length()-n];
        for (int i = n; i < s.length(); i++) {
            s1[i-n] = s.charAt(i);
        }
        char[] s2 = new char[n];
        for (int i = 0; i < n; i++) {
            s2[i] = s.charAt(i);
        }
        return String.copyValueOf(s1)+String.copyValueOf(s2);

    }
    public static void main(String[] args) {
        String s = "abcdefg";
        int k = 2;
        System.out.println(reverseLeftWords(s,k));
    }

}
