package org.train.greedy;

/**
 * LeetCode #55. Jump Game
 * Link: <a href="https://leetcode.com/problems/jump-game/">...</a>
 */
public class JumpToEnd {
    boolean solution(int[] nums) {
        int dest = nums.length - 1;

        for (int i = nums.length - 1; i >= 0; i--) {
            if (i + nums[i] >= dest) {
                dest = i;
            }
        }

        return dest == 0;
    }
}
