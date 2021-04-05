package com.ss.app.hired.assessment.question.angles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void singleElement() {
        String actual = Solution.solution(">");

        assertEquals("<>", actual);
    }

    @Test
    void test2() {
        String actual = Solution.solution(">>>");

        assertEquals("<<<>>>", actual);
    }

    @Test
    void test1() {
        String actual = Solution.solution("><<><");

        assertEquals("<><<><>>", actual);
    }
}