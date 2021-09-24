package IntroToJava;

//Rohan Patel

public class CoolClock2 {
	
	private double theTime;
	
	public void setTime(double time) {
		
		theTime = time;
		
	}
	
	public void tick() {
		
		theTime = (theTime+1)% 60;
		
	}
	
	public void displayTime() {
		
		System.out.println(theTime);
		sleep(750);
		
	}
	
	public static void sleep(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		CoolClock2 tester = new CoolClock2();
		
		// should display the time to be 56, 57, 58, 59, 0, 1, etc.
		tester.setTime(56);
		tester.tick();
		tester.displayTime();
		tester.tick();
		tester.displayTime();
		tester.tick();
		tester.displayTime();
		tester.tick();
		tester.displayTime();
		tester.tick();
		tester.displayTime();
		tester.tick();
		tester.displayTime();
		tester.tick();
		tester.displayTime();
	}

}
