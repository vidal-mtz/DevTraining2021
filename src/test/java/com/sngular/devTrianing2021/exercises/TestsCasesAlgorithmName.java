package com.sngular.devTrining2021.exercises;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestsCasesAlgorithmName {
    @Test
    public void test() {
        assertEquals(985543221, AlgorithmName.orderNumber(125485923));
        assertEquals(998765432, AlgorithmName.orderNumber(346789925));
        assertEquals(98765432, AlgorithmName.orderNumber(29384756));
        assertEquals(987654321, AlgorithmName.orderNumber(514978236));
    }
}