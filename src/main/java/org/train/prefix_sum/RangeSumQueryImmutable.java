package org.train.prefix_sum;

/**
 * LeetCode #303 - Range Sum Query - Immutable
 * Link: <a href="https://leetcode.com/problems/range-sum-query-immutable/">...</a>
 */
public class RangeSumQueryImmutable {
    int[] sums;

    public RangeSumQueryImmutable(int[] nums) {
        sums = new int[nums.length];

        sums[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            sums[i] = sums[i - 1] + nums[i];
        }
    }

    public int solution(int i, int j) {
        if (i == 0) {
            return sums[j];
        }

        return sums[j] - sums[i - 1];
    }
}
