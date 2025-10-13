package org.train.two_pointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * LeetCode #15. Three Sum
 * Link: <a href="https://leetcode.com/problems/3sum/">...</a>
 */
public class ThreeSum {
    List<List<Integer>> solution(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                break;
            }

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            List<List<Integer>> singleResult = twoPointer(nums, i + 1, -nums[i]);
            for (List<Integer> l : singleResult) {
                List<Integer> triplet = new ArrayList<>();
                triplet.add(nums[i]);
                triplet.addAll(l);
                result.add(triplet);
            }
        }

        return result;
    }

    List<List<Integer>> twoPointer(int[] nums, int i, int target) {
        int left = i, right = nums.length - 1;
        List<List<Integer>> result = new ArrayList<>();

        while (left < right) {
            int current = nums[left] + nums[right];
            if (current == target) {
                result.add(List.of(nums[left], nums[right]));
                left++;
                while (left < right && nums[left] == nums[right]){
                    left++;
                }
            } else if (current > target) {
                right--;
            } else {
                left++;
            }
        }

        return result;
    }
}
