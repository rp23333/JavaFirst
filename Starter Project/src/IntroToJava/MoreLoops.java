package IntroToJava;

import java.util.Scanner;

public class MoreLoops {
	
	Scanner MoreLoops = new Scanner(System.in);
	
	// EASY
	
	public void guess() {
		System.out.println("guess my number!");
		int num1 = MoreLoops.nextInt();
		int myNum = 12;
		while (num1 != myNum) {
			System.out.println("keep on guessing!");
			int num2 = MoreLoops.nextInt();
			num1 = num2;
		}
		System.out.println("you guessed it!");
	}
	
	public void negativeToPos() {
		System.out.println("give number!");
		int num1 = MoreLoops.nextInt();
		if (num1<0) {
			num1 = -num1;
		}
		// could have also used while loop
		for(int i=-num1;i<=num1;i++) {
			System.out.println(i);
		}
	}
	
	public void hi() {
		System.out.println("give a positive number!");
		int num1 = MoreLoops.nextInt();
		// could have also used while loop
		for(int i=0;i<num1;i++) {
			System.out.println("hi");
		}
	}
	
	// MEDIUM
	
	public void factorial() {
		System.out.println("give a positive number! (try to make it small)");
		int num1 = MoreLoops.nextInt();
		// could have also used while loop
		int num2 = 1;
		for(int i=1;i<=num1;i++) {
			num2 = i*num2;
		}	
		System.out.println(num2);
	}
	
	public void smallAndDiv() {
		Scanner MoreLoops = new Scanner(System.in);
		System.out.println("give number!");
		int num1 = MoreLoops.nextInt();
		int x=1;
		// could have also used for loop
		while (x<num1) {
			if (num1%x==0) {
				System.out.println(x);
			}
			x++;
		}
	}
	
	// HARD
	
	public void lcm() {
		System.out.println("give me number!");
		int num1 = MoreLoops.nextInt();
		System.out.println("interesting choice. give me another number!");
		int num2 = MoreLoops.nextInt();
		for (int i=Math.max(num1, num2);i<=num1*num2; i+= Math.max(num1, num2)) {
			if (i% Math.min(num1,num2)==0) {
				System.out.println(i);
				break;
			}
		}

		
	}
	
	

	
	public static void main(String[] args) {
		//finalIfs runner = new finalIfs();
		MoreLoops runner = new MoreLoops();
		runner.guess();
		runner.negativeToPos();
		runner.hi();
		runner.factorial();
		runner.smallAndDiv();
		runner.lcm();
		
	}
}
