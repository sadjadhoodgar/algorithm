package org.train.interval;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * LeetCode #56 - Merge Intervals
 * Link: <a href="https://leetcode.com/problems/merge-intervals/">...</a>
 */
public class MergeIntervals {
    public int[][] solution(int[][] intervals){
        List<int[]> merged = new ArrayList<>();
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        merged.add(intervals[0]);

        for(int i = 1; i < intervals.length; i++){
            int[] b = intervals[i];
            int[] a = merged.getLast();

            if(b[0] > a[1]){
                merged.add(b);
            }else{
                merged.set(merged.size() - 1, new int[]{a[0], Math.max(a[1], b[1])});
            }
        }

        return merged.toArray(new int[merged.size()][]);
    }
}
