package com.sngular.devTrining2021.exercises;

public class AlgorithmName {
    public static int[] minMax(int[] arr) {
        int[] result = new int[] { Integer.MAX_VALUE, Integer.MIN_VALUE };

		for (int value : values) {
			if (value < result[0])
				result[0] = value;

			if (value > result[1])
				result[1] = value;
		}

		return result;
    }
}
