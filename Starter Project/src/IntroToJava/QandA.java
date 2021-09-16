package IntroToJava;


public class QandA {

	public static void main(String[] args) {
		
		System.out.println("What's your name?");
		sleep(1000);
		System.out.println();
		
		System.out.println("Rohan.");
		sleep(1000);
		System.out.println();
		
		System.out.println("Where do you live?");
		sleep(1000);
		System.out.println();
		
		System.out.println("I live in Hopkinton, MA.");
		sleep(1000);
		System.out.println();
		
		System.out.println("Do you have any pets?");
		sleep(1000);
		System.out.println();
		
		System.out.println("Nope.");
		sleep(1000);
		System.out.println();
		
		System.out.println("What classes are you taking this fall?");
		sleep(1000);
		System.out.println();
		
		System.out.println("I am taking six total classes: Java, Chemistry, Calculus, US History, Spanish, and American Literature.");
		sleep(1000);
		System.out.println();
		
		System.out.println("What's your favorite class?");
		sleep(1000);
		System.out.println();
		
		System.out.println("Probably Spanish. This is my sixth year taking Spanish and although it takes years to master a language and requires a lot of effort, it's still fun to learn new words and phrases and even engage in full conversations.");
		sleep(1000);
		System.out.println();
		
		System.out.println("What's the last movie you saw?");
		sleep(1000);
		System.out.println();
		
		System.out.println("I saw Taxi Driver starring Robert De Niro yesterday. It was quite bizarre and had some very iconic scenes.");
		sleep(1000);
		System.out.println();
		
		System.out.println("What other homework do you have to do tonight?");
		sleep(1000);
		System.out.println();
		
		System.out.println("I have to read a chapter of The Great Gatsby, do problems for math class, and answer a few questions for chemistry. I had a Spanish writing assigment but I completed it just before moving onto this Q&A assignment. It's only the second day of school and I already have quite a bit of work.");
		sleep(1000);
		System.out.println();
	}
	
	public static void sleep(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
