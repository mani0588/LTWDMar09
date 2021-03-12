package javaPack;

import java.util.Arrays;

public class ArraysAndLoops {

	public static void main(String[] args) {

		// Arrays
		// Group of values with same datatypes
		// Arrays fixed with size

		// Approch 1
		int[] rollNums = { 100, 101, 102 };
		// 3 - 100 101 102

		System.out.println(rollNums[0]);
		System.out.println(rollNums[1]);
		System.out.println(rollNums[2]);

		// Approch 2
		int[] rollNums1 = new int[3];
		// 3 - actual values?
		rollNums1[0] = 200;
		rollNums1[1] = 201;
		rollNums1[2] = 202;

		System.out.println(rollNums1[0]);
		System.out.println(rollNums1[1]);
		System.out.println(rollNums1[2]);

		// repeat block of code execution till condition becomes fail
		for (int i = 0; i < rollNums1.length; i++) {
			System.out.println(rollNums1[i]);
		}

		// for each
		// used for arrays for all values
		for (int rollNum : rollNums1) {
			System.out.println(rollNum);
		}

		System.out.println(rollNums1);
		System.out.println(Arrays.toString(rollNums1));

	}

}
