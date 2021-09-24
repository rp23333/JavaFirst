package IntroToJava;

// Rohan Patel 

public class SomeMath {
	
	private double dist, firstAns, secondAns, average;

	
	public void distance(double x1, double y1, double x2, double y2) {
		
		dist = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		System.out.println(dist);
	
	}
	
	public void quadratic(double a, double b, double c) {
		
		firstAns = -b-Math.sqrt(b*b-4*a*c)/2*a;
		secondAns = -b+Math.sqrt(b*b-4*a*c)/2*a;
		System.out.println(firstAns+ " and " + secondAns);
		
	}
	
	public void charAverage(double firstLet, double secondLet) {
		
		average = (firstLet+secondLet)/2;
		System.out.println((char)average);
		
	}
	
	public static void main(String[] args) {
		
		SomeMath tester = new SomeMath();
		
		tester.distance(1, -2.5, 3.1, 4);
		
		tester.quadratic(1, 0, -4);
		
		tester.charAverage('m', 'A');
	}
}
