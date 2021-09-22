package IntroToJava;

public class SumIt {
	
	private double one, two, sum;
	
	public void setNums(double num1, double num2) {
		one = num1;
		two = num2;
		
	}
	
	public void sum() {
		  sum = (one+two);
	  }
	
	public void print() {
		System.out.println(sum);
		 
		
	  }

	public static void main(String[] args) {
		SumIt runner = new SumIt();
		runner.setNums(5,  7);
		runner.sum();
		runner.print();
		  
		  // should print out 40
		runner.setNums(13, 27);
		runner.sum();
		runner.print();
		
	}
}