package handing.exception;

public class TestException {

	public static void main(String[] args) {
		String test = "no";
		try {
			System.out.println("t");
			doRisky(test);
			System.out.println("o");
		} catch (MyException e) {
			System.out.println("a");
		} finally {
			System.out.println("w");
		}
		System.out.println("s");

	}

	static void doRisky(String t) throws MyException {
		System.out.println("h");
		if ("yes".equals(t))	throw new MyException();

		System.out.println("r");
	}

}