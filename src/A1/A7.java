package A1;

public class A7 {
}

class Solution {
    public int reverse(int x) {
        long res = 0;
        if (x == 0)
            return x;
        boolean flag = x > 0 ? true : false;
        if (!flag)
            x = -x;
        while (x % 10 == 0) {
            x = x / 10;
        }
        while (x > 0) {
            res = res * 10 + x % 10;
            x = x / 10;
        }
        if (!flag)
            res = -res;
        if (res < Integer.MIN_VALUE || res > Integer.MAX_VALUE)
            return 0;
        else
            return (int) res;
    }
}