package org.train.sliding_window;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SubStringAnagramTest {

    SubStringAnagram underTest = new SubStringAnagram();

    @Test
    void solution() {
        Assertions.assertEquals(List.of(0, 6), underTest.solution("cbaebabacd", "abc"));
    }
}