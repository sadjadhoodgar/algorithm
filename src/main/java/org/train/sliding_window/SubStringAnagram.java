package org.train.sliding_window;

import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode #438 - Find All Anagrams in a String
 * Link: <a href="https://leetcode.com/problems/find-all-anagrams-in-a-string/">...</a>
 */
public class SubStringAnagram {
    public List<Integer> solution(String s, String t) {
        var result = new ArrayList<Integer>();

        if (t.length() > s.length()) {
            return result;
        }

        int[] expected = new int[26];
        int[] window = new int[26];

        for (char c : t.toCharArray()) {
            expected[c - 'a']++;
        }

        int right = 0, left = 0;

        while (right < s.length()) {
            window[s.charAt(right) - 'a']++;

            if ((right - left) + 1 >= t.length()) {
                var isMatched = true;
                for (int i = 0; i < 26; i++) {
                    if (window[i] != expected[i]) {
                        isMatched = false;
                        break;
                    }
                }
                if (isMatched) {
                    result.add(left);
                }

                window[s.charAt(left) - 'a']--;
                left++;
            }
            right++;
        }

        return result;
    }
}
