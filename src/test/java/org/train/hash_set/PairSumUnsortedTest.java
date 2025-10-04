package org.train.hash_set;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PairSumUnsortedTest {

    PairSumUnsorted underTest = new PairSumUnsorted();

    @Test
    void solution() {
        Assertions.assertArrayEquals(new int[]{0, 2}, underTest.solution(new int[]{-1, 3, 4, 2}, 3));
    }
}