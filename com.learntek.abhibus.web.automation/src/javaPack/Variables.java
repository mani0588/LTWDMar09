package javaPack;

public class Variables {

	int a = 10; // non-static var
	static int b = 20; // static var

	public void testMethod() {
		int c = 30; // local var
	}

	public static void main(String[] args) {

		// Variables - 3
		// Local, static or class and non-static or instance
		// local - inside the method or block {}
		// non-static - outside the method and inside the class
		// static - outside the method and inside the class; will be declared with
		// static keyword

		int d = 40; // local var

		Variables obj = new Variables();
		System.out.println(obj.a);
		System.out.println(Variables.b);

	}

}
