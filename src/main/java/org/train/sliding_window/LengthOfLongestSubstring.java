package org.train.sliding_window;

import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode #3. Longest Substring Without Repeating Characters
 * Link: <a href="https://leetcode.com/problems/longest-substring-without-repeating-characters/">...</a>
 */
public class LengthOfLongestSubstring {
    int solution(String s) {
        if (s.isEmpty()) {
            return 0;
        }

        int max = 0;

        int left = 0;
        int right = 0;
        Map<Character, Integer> map = new HashMap<>();

        while (right < s.length()) {
            if (map.containsKey(s.charAt(right)) && map.get(s.charAt(right)) >= left) {
                left = map.get(s.charAt(right)) + 1;
            }

            map.put(s.charAt(right), right);
            max = Math.max(max, right - left + 1);
            right++;
        }

        return max;
    }
}
