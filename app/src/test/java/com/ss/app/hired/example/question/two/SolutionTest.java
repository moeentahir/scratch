package com.ss.app.hired.example.question.two;

import com.ss.app.hired.example.question.two.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void level2_whenRightIsBigger_shouldReturnRight() {
        long[] numbers = {3, 6, 9};
        String actual = Solution.solution(numbers);
        assertEquals("Right", actual);
    }

    @Test
    void level2_whenLeftIsBigger_shouldReturnLeft() {
        long[] numbers = {3, 9, 6};
        String actual = Solution.solution(numbers);
        assertEquals("Left", actual);
    }

    @Test
    void level2_whenBothAreEqual_shouldReturnEmpty() {
        long[] numbers = {3, 6, 6};
        String actual = Solution.solution(numbers);
        assertEquals("", actual);
    }

    @Test
    void level3_whenLeftIsBigger_shouldReturnLeft() {
        long[] numbers = {3, 6, 2, 9, -1, 10};
        String actual = Solution.solution(numbers);
        assertEquals("Left", actual);
    }

    @Test
    void level3_whenRightIsBigger_shouldReturnRight() {
        long[] numbers = {3, 6, 2, 9, -1, 10, 5};
        String actual = Solution.solution(numbers);
        assertEquals("Right", actual);
    }
}