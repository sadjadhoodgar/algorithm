package org.train.two_pointer;

/**
 * LeetCode #167 - Two Sum II (Input Array Is Sorted)
 * Link: <a href="https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/">...</a>
 */
public class PairSumSorted {
    public int[] solution(int[] nums, int target){
        int[] pair = {-1, -1};
        int left = 0, right = nums.length - 1;

        while (left < right){
            int sum = nums[left] + nums[right];

            if(sum == target){
                return new int[]{left, right};
            }else if(sum < target){
                left++;
            }else{
                right--;
            }
        }

        return pair;
    }
}
