package IntroToJava;

public class simpleStatements {
	
	public void questionOne(double theNum) {
		
		if (theNum>0) {
			System.out.println("This number is positive");
		}
		else if (theNum<0) {
			System.out.println("This number is negative");
		}
		else{
			System.out.println("This number is zero");
		}
	
	}
	
	public void questionTwo(double ger) {
		
		if (ger%2==0) {
			System.out.println("This number is even");
		}
		else{
			System.out.println("This number is odd");
		}
	}
	
	public void questionThree(double theChar) {
		
		if (theChar>=65 & theChar<=90) {
			System.out.println("This character is uppercase");
		}
		else if (theChar>=97 & theChar<=122){
			System.out.println("This charcter is lowercase");
		}
		else {
			System.out.println("This character is neither");
		}
	}
	
	public void questionFour(double ten) {
		
		if (ten%10==0) {
			System.out.println("This is a multiple of ten");
		}
		else {
			System.out.println("This is not a multiple of ten");
		}
		
	}

	public void questionFive(double a, double b, double c) {
		
		if (a>b & a>b) {
			System.out.println("The biggest number is "+ a);
		}
	
		else if (b>a & b>c) {
			System.out.println("The biggest number is "+ b);
		}
		
		else {
			System.out.println("The biggest number is "+ c);
		}
	}
	
	public void challenge(double thing1, double thing2) {
		
		if (thing1%1 ==0) {
			System.out.println("The number "+thing1+" is a whole number");
		}
		else {
			System.out.println("The number "+thing1+" is not a whole number");
		}
		
		if (thing2%1 ==0) {
			System.out.println("The number "+thing2+" is a whole number");
		}
		else {
			System.out.println("The number "+thing2+" is not a whole number");
		}
		
	}
	
	
	

	
	public static void main(String[] args) {
		
		simpleStatements runner = new simpleStatements();
		runner.questionOne(-3.5);
		runner.questionTwo(77);
		runner.questionThree('A');
		runner.questionFour(101);
		runner.questionFive(123, 213,312);
		runner.challenge(34, 33.56);
		
	}
}
