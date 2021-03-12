package javaPack;

public class ExceptionHandling {

	public static void main(String[] args) throws InterruptedException {

		// Error, exception
		// Execution will be aborted

		// Exception -2
		// Compile time / checked exception
		// Runtime / unchecked exception

		// Way to handle -2
		// throws
		// try catch

		System.out.println("1st line");

		Thread.sleep(2000); // compile time

		try {
			System.out.println(100 / 0); // runtime excep
		} catch (ArithmeticException are) {
			System.out.println("ArithmeticException handled");
		}

		System.out.println("2nd line");

		// compile code
		// run code

	}

}
