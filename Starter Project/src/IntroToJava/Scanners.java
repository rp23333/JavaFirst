package IntroToJava;

import java.util.Scanner;

public class Scanners {
	
	public void bigNum() {
		Scanner Scanners = new Scanner(System.in);
		System.out.println("give me four single digit numbers");
		int Num1 = Scanners.nextInt();
		int Num2 = Scanners.nextInt();
		int Num3 = Scanners.nextInt();
		int Num4 = Scanners.nextInt();
		System.out.print(Num4);
		System.out.print(Num3);
		System.out.print(Num2);
		System.out.print(Num1);
		System.out.println();
	}
	
	public void operation() {
		Scanner Scanners = new Scanner(System.in);
		System.out.println("give me one string and two numbers");
		String word = Scanners.nextLine();
		int Num1 = Scanners.nextInt();
		int Num2 = Scanners.nextInt();
		if (word.equals("subtract")) {
			System.out.println(Num1-Num2);
		}
		else if (word.equals("add")) {
			System.out.println(Num1+Num2);
		}
		else if (word.equals("multiply")) {
			System.out.println(Num1*Num2);
		}
		else if (word.equals("divide")) {
			System.out.println(Num1/Num2);
		}
		else if (word.equals("modulus")) {
			System.out.println(Num1%Num2);
		}
		else {
			System.out.println(word+(char)Num1+(char)Num2);
		}
		
	}
	
	public void score() {
		Scanner Scanners = new Scanner(System.in);
		System.out.println("give me three numbers");
		int Numa = Scanners.nextInt();
		int Numb = Scanners.nextInt();
		int Numc = Scanners.nextInt();
		if ((Numa*7+Numb*3)<Numc) {
			System.out.println("no");
		}
		else if (Numc%3==7 || Numc%3==0) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
	}
	
	public void greatestDigit() {
		Scanner Scanners = new Scanner(System.in);
		System.out.println("give me a three digit number");
		int Num1 = Scanners.nextInt();
		int a = Num1%10;
		int b = ((Num1-a)%100)/10;
		int c = (Num1-a-b)/100;
		if (a>b && a>c) {
			System.out.println(a);
		}
		else if(b>c && b>a) {
			System.out.println(b);
		}
		else {
			System.out.println(c);
		}
		
	}
		

	public static void main(String args[]) {
		Scanners tester = new Scanners();
		tester.bigNum();
		tester.operation();
		tester.score();
		tester.greatestDigit();
	}
	
}
