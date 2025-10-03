package org.train.two_pointer;

/**
 * LeetCode #167 - Two Sum II (Input Array Is Sorted)
 * Link: <a href="https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/">...</a>
 */
public class PairSumSorted {
    public int[] pairSum(int[] nums, int k) {
        int left = 0, right = nums.length - 1;

        while (left < right) {
            int diff = nums[left] + nums[right];

            if (diff == k) {
                return new int[]{left, right};
            } else if (diff >= k) {
                right--;
            } else {
                left++;
            }
        }

        return new int[]{-1, -1};
    }
}
