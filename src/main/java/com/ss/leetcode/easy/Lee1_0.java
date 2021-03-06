package com.ss.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * 简单
 * @author Senn
 * @create 2021/12/25 15:57
 */
public class Lee1_0 {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
