package A1;

import java.util.Map;

public class A12 {
}

/*字符          数值
I             1
V             5
X             10
L             50
C             100
D             500
M             1000

I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。 
C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。

*/

class Solution {
    public String intToRoman(int num) {
        StringBuffer stringBuffer = new StringBuffer();
        int[] values = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        String[] keys = {"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M",};
        for(int i = values.length-1;i>=0;i--){
            while(num>=values[i]){
                stringBuffer.append(keys[i]);
                num -= values[i];
            }
        }
        return stringBuffer.toString();
    }
}