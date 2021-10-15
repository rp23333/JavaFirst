package IntroToJava;

public class NestedLoops {

	// this method has a constant run time
	public void one() {
		for(int i = 65;i<=90;i++) {
			System.out.print((char)i);
		}
	}
	
	// this method has a constant run time
	public void two() {
		System.out.println();
		for (int i=1;i<=12;i++) {
			for (int j = 1;j<=12;j++) {
				System.out.print(i*j+" ");
			}
			System.out.println();
		}
	}
	
	// this method is . . .
	public void three(int x) {
		boolean prime=true;
		for (int i=2;i<x;i++) {
			if (x%i==0) {
				prime = false;
			}
		}
		if (x==0 || x==1 || prime==false) {
			System.out.println("Not a prime number");
		}
		else if (prime==true) {
			System.out.println("It's a prime number");
		}
	}
	
	// this method is linear
	public void four(int n) {
		for (int i=1;i<=n;i++) {
			for (int j = 1;j<=10;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	

	
	public static void main(String[] args) {
		 NestedLoops runner = new NestedLoops();
		 runner.one();
		 runner.two();
		 runner.three(15);
		 runner.four(4);
	}
}
