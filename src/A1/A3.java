package A1;

import java.util.HashSet;
import java.util.Set;

public class A3 {
}

class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() <= 1)
            return s.length();
        Set set = new HashSet();
        int res = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            while (set.contains(chars[i])) {
                res = Math.max(set.size(), res);
                set.remove(chars[i - set.size()]);
            }
            set.add(chars[i]);
        }
        res = Math.max(set.size(), res);
        return res;
    }
}