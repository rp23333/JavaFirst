package IntroToJava;

import java.util.Scanner;

public class WhileLoops {

	public void numChain() {
		Scanner WhileLoops = new Scanner(System.in);
		System.out.println("give me two integers");
		int num1 = WhileLoops.nextInt();
		int num2 = WhileLoops.nextInt();
		
		// first, it determines which number is bigger
		if (num1>num2) {
			while (num1>=num2) {
				System.out.print(num1);
				// if the first number is bigger, it counts down to the second number
				num1--;
			}
		}
		else {
			// if the second number is bigger, it counts up to the first number
			while (num1<=num2) {
				System.out.print(num1);
				num1++;
			}
		}
		
	}
	
	public void exponent() {
		Scanner WhileLoops = new Scanner(System.in);
		System.out.println();
		System.out.println("give me two numbers");
		double num1 = WhileLoops.nextDouble();
		double num2 = WhileLoops.nextDouble();
		
		// uses variable x, when x becomes greater than 5, the while loop ends
		int x=0;
		while (x<=5) {
			// num2 to the x power times num2
			System.out.println(Math.pow(num1, x)*num2);
			x++;
		}
	}
	
	public void sqrt() {
		Scanner WhileLoops = new Scanner(System.in);
		System.out.println();
		System.out.println("give me one positive integer");
		int num1 = WhileLoops.nextInt();
		// x starts at 1 and ends when the number runs through all numbers between 1 and the input number
		int x = 1;
		while (x<=num1) {
			// uses multiplication and if the variable sumNum is exactly equal to the input, it has a root
			int sumNum = x*x;
			if (sumNum == num1) {
				System.out.println("the sqrt of this number is " + x);
				break;
			}
			else {
				x++;
			}
			}
		if (x > num1) {
			System.out.println("does not have a root");
		}
		}
	
	public void something() {
		Scanner WhileLoops = new Scanner(System.in);
		System.out.println();
		System.out.println("give me an integer");
		int num1 = WhileLoops.nextInt();
		int Num2 = 0;
		while (num1>0) {
			Scanner something = new Scanner(System.in);
			System.out.println();
			System.out.println("give me an integer");
			int Num = WhileLoops.nextInt();
			
			if (Num>=Num2) {
				Num2 = Num;
			}
			num1--;
		}
		System.out.println(Num2);
	}
	
	
	public static void main(String[] args) {
		WhileLoops runner = new WhileLoops();
		runner.numChain();
		runner.exponent();
		runner.sqrt();
		runner.something();
		
	}
}
