package LearningJava.Exceptions;

class CustomException extends Exception {
	public CustomException(String message) {
		super(message);
	}
}

public class ThrowableEgPRog {
	public static void main(String a[]) {
		try {
			int age1 = -5;
			if (age1 < 0) {
				throw new CustomException("Age cannot be negative");
			}
		} catch (CustomException e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("it'll run");
		}

	}
}

