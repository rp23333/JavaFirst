package IntroToJava;

import java.util.Scanner;

public class finalIfs {
	
	public void baseTen(int num1, int num2, int num3 , int num4 , int num5){
		double bigNum1 = Math.pow((2*num1), 4)+ Math.pow((2*num2), 3)+ Math.pow((2*num3), 2)+Math.pow((2*num4), 1)+ Math.pow((2*num5), 0);
		
		System.out.println(bigNum1);
	}
	
	public void strSwitch() {
		Scanner finalIfs = new Scanner(System.in);
		System.out.println("give me two strings");
		String str1 = finalIfs.nextLine();
		String str2 = finalIfs.nextLine();
		String strVal1 = str1;
		String strVal2 = str2;
		str1 = strVal2;
		str2 = strVal1;
		System.out.println(str1);
		System.out.println(str2);
	}
	
	public void remainders(int num1) {
		double Num1 = num1;
		double num2 = Num1-Num1%1000;
		double twoDigs = num2/1000;
		double num3 = (((Num1-num2)-(Num1-num2))%100);
		double thirdDig = (((Num1-num2)-(Num1-num2))%100)/100;
		double fourthDig = (Num1-num2-num3)%10/10;
		double fifthDig = Num1%10;
		System.out.println(twoDigs%thirdDig);
		System.out.println(twoDigs%fourthDig);
		System.out.println(twoDigs%fifthDig);
	}
	
	public void sumLet (char let1, char let2) {
		int sum = let1 + let2;
		if ((char) sum <97) {
			System.out.println('a');
		}
		else if ((char)sum>122) {
			System.out.println('z');
		}
		else {
			System.out.println((char)sum);
		}
	}

	
	public static void main(String[] args) {
		//finalIfs runner = new finalIfs();
		finalIfs runner = new finalIfs();
		runner.baseTen(1,0,1,1,1);
		runner.strSwitch();
		runner.remainders(23455);
		runner.sumLet('c','d');
		
	}
}
