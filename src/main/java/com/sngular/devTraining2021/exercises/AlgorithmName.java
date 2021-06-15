package com.sngular.devTrining2021.exercises;

public class AlgorithmName {
   /**
	 * ORDER Numbers
	 * 
	 * The task is to make a function that can take any non-negative integer as an
	 * argument and return it with its digits in descending order. Essentially
	 * rearrange the digits to create the highest number possible.
	 * 
	 * Example:
	 * 
	 * orderNumbers(21445) -> 54421
	 * 
	 * orderNumbers(145263) -> 654321
	 * 
	 * orderNumbers(1254859723) -> 9875543221
	 * 
	 * @param number
	 * @return highest number possible
	 */
	public long orderNumbers(long number) {
		if (number > 0) {
			StringBuilder str = new StringBuilder(10);
			str.append(String.valueOf(number));
			int length = str.length();
			char[] digits = new char[length];

			for (int i = 0; i < length; i += 1) {
				digits[i] = str.charAt(i);
			}

			Arrays.sort(digits);

			for (int i = 0; i < length; i += 1) {
				str.setCharAt(i, digits[length - i - 1]); // reverse
			}

			return Long.parseLong(str.toString());
		} else {
			return number;
		}
	}

	/**
	 * ACCUM
	 * 
	 * Program the accum function, which has the behavior of the following examples,
	 * that complies with the test cases defined in the AccumClsTest class.
	 * Examples:
	 *
	 * accum("abcd") -> A-Bb-Ccc-Dddd
	 * 
	 * accum("RqaEzty") ->R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy
	 * 
	 * accum("cwAt") -> C-Ww-Aaa-Tttt
	 * 
	 * @param data
	 * @return
	 */
	public String accum(String data) {
		StringBuilder str = new StringBuilder(50);

		String car;
		for (int i = 0; i < data.length(); i += 1) {
			if (i > 0)
				str.append('-');

			car = data.substring(i, i + 1);
			str.append(car.toUpperCase());
			car = car.toLowerCase();
			for (int n = 0; n < i; n += 1) {
				str.append(car);
			}
		}
		return str.toString();
	}

	/**
	 * Isogram
	 * 
	 * An isogram is a word that has no repeating, consecutive, or non-consecutive
	 * letters. Implement a function that determines whether a string containing
	 * only letters is an isogram. Suppose the empty string is an isogram. Ignore
	 * upper and lower case.
	 * 
	 * Example:
	 * 
	 * isIsograma("dermatoglyphics") -> true
	 * 
	 * isIsograma("mooose") -> false
	 * 
	 * isIsograma("aba") -> false
	 * 
	 * @param data
	 * @return
	 */
	public boolean isIsograma(String data) {
		boolean isOk = true;
		Set<Integer> unique = new LinkedHashSet<>();
		int number;
		for (int i = 0; i < data.length(); i += 1) {
			number = data.charAt(i);
			if (!unique.add(number)) {
				isOk = false;
				break;
			}
		}

		return isOk;
	}

	/**
	 * You will be given a series of whole numbers. Take that matrix and find the
	 * index N where the sum of the integers to the left of N equals the sum of the
	 * integers to the right of N. If there is no index that does this, return -1.
	 * 
	 * Example1: Suppose you are given the array {1,2,3,4,3,2,1}: Your function will
	 * return the index 3, because in the third position of the array, the sum of
	 * the left side of the index ({ 1,2,3}) and the sum on the right side of the
	 * index ({3,2, 1}) both equal 6.
	 * 
	 * Example2: You are given the matrix {1,100,50, -51,1,1}: Your function will
	 * return the index 1, because in the first position of the matrix, the sum of
	 * the left side of the index ({1}) and the sum of the right side of the index
	 * ({50, -51,1,1}) both are equal to 1.
	 * 
	 * Example3: You are given the matrix {20,10, -80,10,10,15,35}. At index 0, the
	 * left side is {} The right side is {10, -80,10,10,15,35} Both are equal to 0
	 * when added. (The empty arrays are equal to 0 in this problem) Index 0 is the
	 * place where the left side and the right side are equal.
	 * 
	 */
	public int matrix(int[] array) {
		int result = -1;
		int left = 0;
		int right;
		int max = array.length / 2 + 1;
		int length = array.length;

		for (int i = 1; i < max; i += 1) {
			left = sumArray(array, 0, i);
			right = sumArray(array, i + 1, length);

			if (left == right) {
				result = i;
				break;
			}
		}

		return result;
	}

	private int sumArray(int[] array, int ini, int fin) {
		int suma = 0;
		for (int i = ini; i < fin; i += 1) {
			suma += array[i];
		}
		return suma;
	}

	/**
	 * MinMax
	 * 
	 * Write a function that returns the minimum and maximum number from the given
	 * list / array.
	 * 
	 * minMax({1,2,3,4,5}) => {1,5}
	 * 
	 * minMax({2334454,5}) => {5,2334454}
	 * 
	 * minMax({1}) => {1,1}
	 * 
	 * @param values
	 * @return
	 */
	public int[] minMax(int[] values) {
		int[] result = new int[2];
		result[0] = Integer.MAX_VALUE;
		result[1] = 0;
		int value;

		for (int i = 0; i < values.length; i += 1) {
			value = values[i];
			if (value < result[0])
				result[0] = value;

			if (value > result[1])
				result[1] = value;
		}

		return result;
	}
}
