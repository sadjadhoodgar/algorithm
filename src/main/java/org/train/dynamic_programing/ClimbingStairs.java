package org.train.dynamic_programing;

/**
 * LeetCode #70. Climbing Stairs
 * Link: <a href="https://leetcode.com/problems/climbing-stairs/">...</a>
 */
public class ClimbingStairs {
	int solution(int n) {
		if (n <= 2) {
			return n;
		}

		int oneStepBefore = 2, twoStepBefore = 1;

		for (int i = 3; i <= n; i++) {
			int current = oneStepBefore + twoStepBefore;

			twoStepBefore = oneStepBefore;
			oneStepBefore = current;
		}

		return oneStepBefore;
	}
}
