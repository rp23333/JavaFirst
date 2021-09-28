package IntroToJava;

public class IfStatement {

	public static void main(String[] args) {
		
		int x= 5;
		
		if (x > 3) {
			System.out.println("hello");
			
		}
		else if (x <= 2 ) {
			System.out.println("hi");
		}
		else {
			
		}
		
		String y = "type";
		
		
		if (y.equals("key")) {
			// Use .equals for non-primitive types
			// Use == for primitive types
			System.out.println(y);
		}
		else {
			System.out.println(y+" cool");
		}
	}
	
}
