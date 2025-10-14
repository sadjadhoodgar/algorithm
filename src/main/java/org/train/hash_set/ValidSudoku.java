package org.train.hash_set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * LeetCode #36. Valid Sudoku
 * Link: <a href="https://leetcode.com/problems/valid-sudoku/">...</a>
 */
public class ValidSudoku {
    boolean solution(char[][] board) {
        List<Set<Character>> rows = new ArrayList<>();
        List<Set<Character>> columns = new ArrayList<>();
        Set<Character>[][] sBoards = new HashSet[3][3];

        for (int i = 0; i < 9; i++) {
            rows.add(new HashSet<>());
            columns.add(new HashSet<>());
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sBoards[i][j] = new HashSet<>();
            }
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char curr = board[i][j];

                if(curr == '.'){
                    continue;
                }

                if (rows.get(i).contains(curr)) {
                    return false;
                }

                if (columns.get(j).contains(curr)) {
                    return false;
                }

                if (sBoards[i / 3][j / 3].contains(curr)) {
                    return false;
                }

                rows.get(i).add(curr);
                columns.get(j).add(curr);
                sBoards[i / 3][j / 3].add(curr);
            }
        }
        return true;
    }
}
