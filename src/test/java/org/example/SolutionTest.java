package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void canConstructTest() {
        Solution solution = new Solution();
        assertFalse(solution.canConstruct("a", "b"));
        assertFalse(solution.canConstruct("aa", "ab"));
        assertTrue(solution.canConstruct("aa", "aab"));
    }

}