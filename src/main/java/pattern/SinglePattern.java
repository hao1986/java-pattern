package pattern;

import java.util.Random;

public class SinglePattern {
	private static SinglePattern ton = null;
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	static {
		System.out.println("static--111------");
	}

	private SinglePattern() {
		System.out.println("start---222--");
		this.message = String.valueOf(new Random().nextInt());
	}

	public static SinglePattern getInstance() {
		if (ton == null) {
			System.out.println("11111111111");
			ton = new SinglePattern();
		}
		return ton;
	}

	@Override
	public String toString() {
		System.out.println(getMessage());
		return "SinglePattern [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}
