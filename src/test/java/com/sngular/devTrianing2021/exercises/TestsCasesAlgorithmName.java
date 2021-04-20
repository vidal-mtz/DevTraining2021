package com.sngular.devTrining2021.test.exercises;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestsCasesAlgorithmName {
    @Test
    public void test() {
        assertEquals(true, AlgorithmName.isIsogram("Dermatoglyphics"));
        assertEquals(true, AlgorithmName.isIsogram("isogram"));
        assertEquals(false, AlgorithmName.isIsogram("moose"));
        assertEquals(false, AlgorithmName.isIsogram("isIsogram"));
        assertEquals(false, AlgorithmName.isIsogram("aba"));
        assertEquals(false, AlgorithmName.isIsogram("moOse"));
        assertEquals(true, AlgorithmName.isIsogram("thumbscrewjapingly"));
        assertEquals(true, AlgorithmName.isIsogram(""));
    }
}