package IntroToJava;


public class cwOperations {
	
	public void questionOne(int Num1) {
		
		System.out.println((char)Num1);
		
	}
	
	public void questionTwo(int Num2){
		
		System.out.println(Num2%10);
		
	}
	
	public void questionThree(int Num4, int Num5) {
		
		System.out.println((Num4+Num5)/2);
		
	}
	
	
	public static void main(String[] args) {
		
		cwOperations runner = new cwOperations();
		runner.questionOne(106);
		runner.questionTwo(16);
		runner.questionThree(18,20);
		
	}
}
