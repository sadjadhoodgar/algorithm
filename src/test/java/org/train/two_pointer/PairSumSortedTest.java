package org.train.two_pointer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PairSumSortedTest {

    PairSumSorted undertest = new PairSumSorted();

    @Test
    void pairSum() {
        Assertions.assertArrayEquals(new int[]{2, 3}, undertest.pairSum(new int[]{-5, -2, 3, 4, 6}, 7));
    }

    @Test
    void pairSum_notExist() {
        Assertions.assertArrayEquals(new int[]{-1, -1}, undertest.pairSum(new int[]{-5, -2, 3, 4, 6}, 98));
    }
}