package javaPack;

public class StringFunctions {

	public static void main(String[] args) {

		String address = "#10, Chennai - 100";
		System.out.println("No. of chars " + address.length()); // no. of chars

		String[] words = address.split(" ");
		System.out.println("No. of words " + words.length); // no. of words

		System.out.println(address.charAt(5));
		System.out.println(address.indexOf('C'));

		System.out.println(address.startsWith("#10"));
		System.out.println(address.endsWith("00"));
		System.out.println(address.contains("Chennai"));

		System.out.println(address.toUpperCase());
		System.out.println(address.toLowerCase());

		System.out.println(address.replaceAll("[^0-9]", "")); // numbers alone
		System.out.println(address.replaceAll("[^A-z]", "")); // alphabets alone
		System.out.println(address.replaceAll("[0-9A-z]", "")); // special chars alone

		String address1 = "#10, Chennai - 100";
		String address2 = "#10, chennai - 100";

		System.out.println(address1.equals(address2));
		System.out.println(address1.equalsIgnoreCase(address2));

		String address3 = "			#10, Chennai - 100   ";
		System.out.println(address3.trim());

	}

}
