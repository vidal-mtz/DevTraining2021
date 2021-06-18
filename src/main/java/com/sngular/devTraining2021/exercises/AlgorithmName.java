package com.sngular.devTrining2021.exercises;

public class AlgorithmName {
    public static int findEvenIndex(int[] arr) {
        int result = -1;
		int left = 0;
		int right = 0;
		int max = arr.length / 2 + 1;
		int length = arr.length;

		int i = 1;
		do {
			left = sumArray(arr, 0, i);
			right = sumArray(arr, i + 1, length);
		} while (left != right && max != i++);

		if (left == right)
			result = i;

		return result;
	}

	private static int sumArray(int[] array, int ini, int fin) {
		int suma = 0;
		for (int i = ini; i < fin; i += 1) {
			suma += array[i];
		}
		return suma;
    }
}
