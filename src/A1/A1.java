package A1;

import java.util.HashMap;
import java.util.Map;

/**
 * @author baiweiyang
 */
public class A1 {
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(target - nums[i])) {
                map.put(nums[i], i);
            } else {
                return new int[]{i, (int) map.get(target - nums[i])};
            }
        }
        return new int[2];
    }
}
