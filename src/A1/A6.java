package A1;

import java.util.*;

public class A6 {
}

class Solution {
    public String convert(String s, int numRows) {
        if(numRows <=1)
            return s;
        char[] chars = s.toCharArray();
        int[] rows = new int[chars.length];
        int cur = 0;
        boolean flag = true;
        for (int i = 0; i < rows.length; i++) {
            rows[i] = cur;
            if (flag) {
                cur++;
                if (cur == numRows - 1) {
                    flag = false;
                }
            } else {
                cur--;
                if (cur == 0) {
                    flag = true;
                }
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0;i<numRows;i++){
            for(int j = 0;j< rows.length;j++){
                if(rows[j] == i){
                    stringBuilder.append(chars[j]);
                }
            }
        }
        return  stringBuilder.toString();
    }
}