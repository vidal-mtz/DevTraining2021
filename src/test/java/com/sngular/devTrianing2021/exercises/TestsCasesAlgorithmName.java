package com.sngular.devTrining2021.test.exercises;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestsCasesAlgorithmName {

    @Test
	public void test_orderNumbers() {
		AlgorithmName object = new AlgorithmName();

		assertEquals("orderNumbers 21445", object.orderNumbers(21445), 54421);
		assertEquals("orderNumbers 145263", object.orderNumbers(145263), 654321);
		assertEquals("orderNumbers 1254859723", object.orderNumbers(1254859723), 9875543221L);
	}

	@Test
	public void test_accum() {
		AlgorithmName object = new AlgorithmName();

		assertEquals("accum 21445", object.accum("abcd"), "A-Bb-Ccc-Dddd");
		assertEquals("accum RqaEzty", object.accum("RqaEzty"), "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy");
		assertEquals("accum cwAt", object.accum("cwAt"), "C-Ww-Aaa-Tttt");
	}

	@Test
	public void test_isIsograma() {
		AlgorithmName object = new AlgorithmName();

		assertEquals("isIsograma dermatoglyphics", true, object.isIsograma("dermatoglyphics"));
		assertEquals("isIsograma mooose", false, object.isIsograma("mooose"));
		assertEquals("isIsograma aba", false, object.isIsograma("aba"));
	}

	@Test
	public void test_matrix() {
		AlgorithmName object = new AlgorithmName();

		assertEquals("matrix {1,2,3,4,3,2,1}", 3, object.matrix(new int[] { 1, 2, 3, 4, 3, 2, 1 }));
		assertEquals("matrix {1,100,50, -51,1,1}", 1, object.matrix(new int[] { 1, 100, 50, -51, 1, 1 }));
		assertEquals("matrix {20,10, -80,10,10,15,35}", -1, object.matrix(new int[] { 20, 10, -80, 10, 10, 15, 35 }));
	}

	@Test
	public void test_minMax() {
		AlgorithmName object = new AlgorithmName();

		assertArrayEquals("minMax({1,2,3,4,5})", new int[] { 1, 5 }, object.minMax(new int[] { 1, 2, 3, 4, 5 }));
		assertArrayEquals("minMax({2334454,5})", new int[] { 5, 2334454 }, object.minMax(new int[] { 2334454, 5 }));
		assertArrayEquals("minMax({1})", new int[] { 1, 1 }, object.minMax(new int[] { 1 }));
	}
}
