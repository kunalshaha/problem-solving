package test;

public class inhertanceSample {
	
	public static void main(String args[]) {
		B b =new B();
		if (b instanceof B) {
			System.out.println("selb");

			
		}
		
		if ((b instanceof A)) {
			System.out.println("sel2");

			
		}
	}

}
