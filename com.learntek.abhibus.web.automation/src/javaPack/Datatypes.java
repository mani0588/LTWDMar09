package javaPack;

public class Datatypes {

	public static void main(String[] args) {

		// Data types - 10
		// primitive types - 8
		// byte, short, int, long
		// float, double, char, boolean

		byte by = 127; // 2^7
		short sh = 128; // 2^15
		int num = 10; // 2^31
		long lon = 10; // 2^63

		float fl = 10.123456789f;
		double doub = 10.1234567890123456;

		char ch = 'a';
		boolean bool = true; // false

		System.out.println("value of by is " + by);
		System.out.println("value of by is " + sh);
		System.out.println("value of by is " + num);
		System.out.println("value of by is " + lon);
		System.out.println("value of by is " + fl);
		System.out.println("value of by is " + doub);
		System.out.println("value of by is " + ch);
		System.out.println("value of by is " + bool);

		// Non-Primitive data types
		// String
		// Arrays - group of values

		String address = "#10, Chennai - 100";
		// String address = new String("#10, Chennai - 100");
		System.out.println("No. of chars " + address.length());

	}

}
