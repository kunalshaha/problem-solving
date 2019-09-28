package test;

public class sample {
	
	public static void main(String args[]) {
		try {
			badMethod();
			System.out.println("try");
		}catch (Exception e) {
			System.out.println("catch");
		}
		finally {
			System.out.println("finalluy");
		}
		System.out.println("out");

	}
	
	  static void badMethod() {}

}
