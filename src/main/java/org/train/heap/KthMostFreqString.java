package org.train.heap;

import java.util.*;

/**
 * LeetCode #692 - Top K Frequent Words
 * Link: <a href="https://leetcode.com/problems/top-k-frequent-words/">...</a>
 */
public class KthMostFreqString {
    public List<String> solution(String[] words, int k) {
        Map<String, Integer> map = new HashMap<>();

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        Queue<HeapNode> minHeap = new PriorityQueue<>((a, b) ->
        {
            if (a.frq == b.frq) {
                return b.word.compareTo(a.word);
            }
            return a.frq - b.frq;
        });

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            minHeap.offer(new HeapNode(entry.getKey(), entry.getValue()));
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        List<String> result = new ArrayList<>();
        while (!minHeap.isEmpty()) {
            result.add(minHeap.poll().word);
        }

        List<String> reversed = new ArrayList<>();
        for (int i = result.size() - 1; i >= 0; i--) {
            reversed.add(result.get(i));
        }

        return reversed;
    }
}
