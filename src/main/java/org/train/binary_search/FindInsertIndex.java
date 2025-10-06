package org.train.binary_search;

/**
 * LeetCode #35 - Search Insert Position
 * Link: <a href="https://leetcode.com/problems/search-insert-position/">...</a>
 */
public class FindInsertIndex {
    public int solution(int[] nums, int k) {
        int left = 0, right = nums.length - 1;

        while (left < right) {
            int mid = (right + left) / 2;

            if (nums[mid] >= k) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        if (nums[left] < k) {
            left++;
        }
        return left;
    }
}
