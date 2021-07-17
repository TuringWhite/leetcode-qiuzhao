package A1;

public class A9 {
}

class Solution {
    public static boolean isPalindrome(int x) {
        if (x < 0) return false;
        StringBuffer temp = new StringBuffer(String.valueOf(x));
        return temp.toString().equals(temp.reverse().toString());
    }
}