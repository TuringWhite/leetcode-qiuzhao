package A1;

public class A13 {
}
class Solution {
    public int romanToInt(String s) {
        int[] keys = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        String[] values = {"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M",};
        int res = 0;
        for(int i = keys.length-2;i>=0;i -=2){
            if(s.contains(values[i])){
                res +=keys[i];
                s= s.replaceAll(values[i],"");
            }
        }
        for(int i = keys.length-1;i>=0;i -=2){
            while(s.contains(values[i])){
                res += keys[i];
                s= s.replaceFirst(values[i],"");
            }
        }
        return  res;
    }
}