package IntroToJava;

public class SomeMoreMath {
	
	double keyNum;
	
	public void halve(double x) {
		System.out.println(x/2);
	}

	
	public void square(double x) {
		System.out.println(Math.pow(x, 2));
	}
	
	public void averageFive(double num1, double num2, double num3, double num4,double num5) {
		System.out.println((num1+num2+num3+num4+num5)/5);
	}
	
	public void raiseToTheFourth(double theNum) {
		System.out.println(Math.pow(theNum, 4));
	}
	
	public void setKey(double theNum) {
		keyNum = theNum;
	}

	public void multiplyByKey(double theNum) {
		System.out.println(keyNum*theNum);
	}

	public void keyCubed(double theNum) {
		System.out.println(keyNum*theNum);
	}
	
	public void makeInteger(double someNum) {
		System.out.println((int)someNum);
	}
	
	public void roundToNearestWhole(double someNum) {
	
		someNum = someNum+0.5;
		System.out.println((int)(someNum));
		
	}
	
	public static void main(String args[]) {
		
		SomeMoreMath tester = new SomeMoreMath();
		
		// example method
		// output: 4
		tester.halve(8);
		
		// you are in charge of making the rest of these work
		
		// output: 49
		tester.square(7);
		
		// output: 7
		tester.averageFive(7,10,5,7,6);
		
		// output: 81
		tester.raiseToTheFourth(3);
		
		// output: nothing, just save the number 4 as an instance variable
		tester.setKey(4);
		
		// output: 28
		tester.multiplyByKey(7);
		
		// output: 64
		tester.keyCubed(16);
		
		// output: 3
		tester.makeInteger(3.756);
		
		// output: 8
		tester.roundToNearestWhole(7.4);
	}

}
