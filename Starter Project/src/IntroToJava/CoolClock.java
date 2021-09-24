package IntroToJava;

public class CoolClock {
	
	private double theTime;
	
	public void setTime(double time) {
		
		theTime = time;
		
	}
	
	public void tick() {
		
		theTime++;
		
	}
	
	public void displayTime() {
		
		System.out.println(theTime%60);
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
		CoolClock tester = new CoolClock();
		
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
