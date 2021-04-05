package com.ss.app.hired.assessment.question.two;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test1() {
        long actual = Solution.solution(4);

        assertEquals(4, actual);
    }
}