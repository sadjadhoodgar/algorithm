package org.train.hash_set;

import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode #1 - Two Sum
 * Link: <a href="https://leetcode.com/problems/two-sum/">...</a>
 */
public class PairSumUnsorted {
    public int[] solution(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int diff = k - nums[i];

            if (map.containsKey(diff)) {
                return new int[]{map.get(diff), i};
            } else {
                map.put(nums[i], i);
            }
        }

        return new int[]{-1, -1};
    }
}
