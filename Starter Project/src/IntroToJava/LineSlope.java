package IntroToJava;

public class LineSlope {
	
	private double one, two, three, four, slope;
	
	public void set_coordinates (double x1, double y1, double x2, double y2) {
	
		one = x1;
		two = y1;
		three = x2;
		four = y2;
	
	}
	
	public void calculate_slope () {
	
		slope = (four-two)/(three-one);
	}

	public void display_slope () {
		
		System.out.println(slope);
		
	}
	
	public static void main(String[] args) {
		
		LineSlope runner = new LineSlope();
		
		
		runner.set_coordinates(3, 3, 7, 11);
		runner.calculate_slope();
		runner.display_slope();
		
		
		runner.set_coordinates(0, -2, -4, 1);
		runner.calculate_slope();
		runner.display_slope();

	}
}
