package org.train.backtracking;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * LeetCode #46. Permutations
 * Link: <a href="https://leetcode.com/problems/permutations/">...</a>
 */
public class FindAllPermutations {
    List<List<Integer>> solution(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        dfs(nums, new HashSet<>(), new ArrayList<>(), result);
        return result;
    }

    void dfs(int[] nums, Set<Integer> used, List<Integer> candidate, List<List<Integer>> result) {
        if (candidate.size() == nums.length) {
            result.add(new ArrayList<>(candidate));
            return;
        }

        for (int num : nums) {
            if (!used.contains(num)) {
                candidate.add(num);
                used.add(num);

                dfs(nums, used, candidate, result);

                candidate.removeLast();
                used.remove(num);
            }
        }
    }
}
