package A1;

import java.util.*;

public class A15 {
}

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        if (nums.length < 3)
            return new ArrayList<List<Integer>>();
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        int a = 0, b = nums.length - 2, c = nums.length - 1;
        while (1 < c) {
            int target = -nums[c];
            a = 0;
            b = c - 1;
            while (a < b) {
                if (nums[a] + nums[b] == target) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[a]);
                    list.add(nums[b]);
                    list.add(nums[c]);
                    res.add(list);
                    b--;
                    while (a < b && nums[b] == nums[b + 1])
                        b--;
                } else if (nums[a] + nums[b] > target) {
                    b--;
                    while (a < b && nums[b] == nums[b + 1])
                        b--;
                } else if (nums[a] + nums[b] < target) {
                    a++;
                    while (a < b && nums[a] == nums[a - 1]) {
                        a++;
                    }
                }
            }
            c--;
            while (c > 1 && nums[c] == nums[c + 1])
                c--;
        }
        return res;
    }
}