package com.sngular.devTrining2021.test.exercises;

import static org.junit.Assert.*;
import com.sngular.devTrining2021.exercises.AlgorithmName;

public class TestsCasesAlgorithmName {
    @Test
    public void test() {
       /* assertEquals(9875543221, AlgorithmName.orderNumber(1254859723));
        assertEquals(998765432, AlgorithmName.orderNumber(346789925));
        assertEquals(65544332211, AlgorithmName.orderNumber(12345654321));
        assertEquals(98765432, AlgorithmName.orderNumber(29384756));*/
        assertEquals(221, AlgorithmName.orderNumber(723));
    }
}