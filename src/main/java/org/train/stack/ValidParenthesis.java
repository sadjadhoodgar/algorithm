package org.train.stack;

import java.util.*;

/**
 * LeetCode #20 - Valid Parentheses
 * Link: <a href="https://leetcode.com/problems/valid-parentheses/">...</a>
 */
public class ValidParenthesis {
    public boolean solution(String s) {
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');

        Set<Character> set = new HashSet<>(map.values());

        Deque<Character> stack = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                stack.push(c);
            }

            if (set.contains(c)) {
                if (stack.isEmpty() || map.get(stack.pop()) != c) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
