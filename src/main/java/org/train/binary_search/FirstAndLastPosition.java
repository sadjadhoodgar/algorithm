package org.train.binary_search;

/**
 * LeetCode #34. Find First and Last Position of Element in Sorted Array
 * Link: <a href="https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/">...</a>
 */
public class FirstAndLastPosition {
    int[] solution(int[] nums, int target) {
        if (nums.length < 1) {
            return new int[]{-1, -1};
        }
        return new int[]{lowerBound(nums, target), upperBound(nums, target)};
    }

    int lowerBound(int[] nums, int k) {
        int left = 0, right = nums.length - 1;

        while (left < right) {
            int mid = (right + left) / 2;
            int midVal = nums[mid];

            if (midVal > k) {
                right = mid - 1;
            } else if (midVal < k) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return (nums[left] == k) ? left : -1;
    }

    int upperBound(int[] nums, int k) {
        int left = 0, right = nums.length - 1;

        while (left < right) {
            int mid = (right + left) / 2 + 1;
            int midVal = nums[mid];

            if (midVal > k) {
                right = mid - 1;
            } else if (midVal < k) {
                left = mid + 1;
            } else {
                left = mid;
            }
        }

        return (nums[right] == k) ? right : -1;
    }
}
