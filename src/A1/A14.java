package A1;


public class A14 {
}

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0)
            return "";
        StringBuffer res = new StringBuffer();
        for (int i = 0; i < strs[0].length(); i++) {
            char cur = strs[0].charAt(i);
            for (String str : strs) {
                if (i > str.length() - 1 || cur != str.charAt(i))
                    return res.toString();
            }
            res.append(cur);
        }
        return  res.toString();
    }
}