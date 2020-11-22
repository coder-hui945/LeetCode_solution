package solution1528;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public String restoreString(String s, int[] indices) {
        char[] res = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            res[indices[i]] = s.charAt(i);
        }
        return String.copyValueOf(res);
    }
}