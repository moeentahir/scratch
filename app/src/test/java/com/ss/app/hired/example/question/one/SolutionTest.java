package com.ss.app.hired.example.question.one;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void maxNumberOfTwo() {
        long[] numbers = {2, 1};
        long actual = Solution.solution(numbers);

        assertEquals(2, actual);
    }

    @Test
    void moreNumbers() {
        long[] numbers = {7, 2, 6, 3};
        long actual = Solution.solution(numbers);

        assertEquals(7, actual);
    }

    @Test
    void negativeNumbers() {
        long[] numbers = {-1, -2, -3};
        long actual = Solution.solution(numbers);

        assertEquals(-1, actual);
    }

    @Test
    void emptyArray() {
        long[] numbers = {};
        long actual = Solution.solution(numbers);

        assertEquals(0, actual);
    }
}