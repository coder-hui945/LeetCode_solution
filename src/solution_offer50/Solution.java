
package solution_offer50;

import java.util.Map;

class Solution {
    public char firstUniqChar(String s) {
        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i)-'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (count[s.charAt(i)-'a']==1)
                return s.charAt(i);
        }
        return ' ';
    }
}