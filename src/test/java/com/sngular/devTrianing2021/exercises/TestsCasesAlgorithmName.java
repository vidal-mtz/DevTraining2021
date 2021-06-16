package com.sngular.devTrining2021.test.exercises;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestsCasesAlgorithmName {
    @Test
    public void testOne() {
        assertEquals("Test value {1,2,3,4,3,2,1}",3,AlgorithmName.findEvenIndex(new int[] {1,2,3,4,3,2,1}));
    }
    @Test
    public void testTwo() {
        assertEquals("Test value {1,100,50,-51,1,1}",1,AlgorithmName.findEvenIndex(new int[] {1,100,50,-51,1,1}));
    }
    @Test
    public void testThree() {
        assertEquals("Test value {1,2,3,4,5,6}",-1,AlgorithmName.findEvenIndex(new int[] {1,2,3,4,5,6}));
    }
    @Test
    public void testFour() {
        assertEquals("Test value {20,10,30,10,10,15,35}",3,AlgorithmName.findEvenIndex(new int[] {20,10,30,10,10,15,35}));
    }
    @Test
    public void testFive() {
        assertEquals("Test value {-8505, -5130, 1926, -9026}",-1,AlgorithmName.findEvenIndex(new int[] {-8505, -5130, 1926, -9026}));
    }
    @Test
    public void testSix() {
        assertEquals("Test value {2824, 1774, -1490, -9084, -9696, 23094}",1,AlgorithmName.findEvenIndex(new int[] {2824, 1774, -1490, -9084, -9696, 23094}));
    }
    @Test
    public void testSeven() {
        assertEquals("Test value {4, 5, 6, 7, 8, 9, 10, 9, 8, 7, 6, 5, 4}",6,AlgorithmName.findEvenIndex(new int[] {4, 5, 6, 7, 8, 9, 10, 9, 8, 7, 6, 5, 4}));
    }
}