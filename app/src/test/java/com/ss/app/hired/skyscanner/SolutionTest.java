package com.ss.app.hired.skyscanner;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        boolean actual = Solution.solution("()");

        assertTrue(actual);
    }

    @Test
    void test2() {
        boolean actual = Solution.solution("{(})");

        assertFalse(actual);
    }

    @Test
    void test3() {
        boolean actual = Solution.solution("()()()");

        assertTrue(actual);
    }

    @Test
    void test4() {
        boolean actual = Solution.solution("{()()}[]");

        assertTrue(actual);
    }

    @Test
    void test5() {
        boolean actual = Solution.solution("({[]})");

        assertTrue(actual);
    }

    @Test
    void test6() {
        boolean actual = Solution.solution(")(()()");

        assertFalse(actual);
    }

    @Test
    void test7() {
        boolean actual = Solution.solution("[{((})]");

        assertFalse(actual);
    }
}