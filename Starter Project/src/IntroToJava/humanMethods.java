package IntroToJava;

public class humanMethods {
	
	double theAge;
	char theGender;
	
	public void setAge(double age) {
		theAge = age;
		System.out.println(theAge);
	}
	
	public void setGender(char gender){
		theGender = gender;
		if (theGender == 'g'){
			System.out.println("girl");
		}
		else{
			System.out.println("boy");
		}
		
		
		
	}
	
	public void canVote() {
		if (theAge>=18) {
			System.out.println("You can vote!");
		}
		else {
			System.out.println("You can't vote :(");
		}
	}
		
	public void tetanusShot() {
		if (theAge%4==0) {
			System.out.println("Get your tetanus shot now!");
		}
		else {
			System.out.println("You're good for now");
		}
	}
	
	public void toddler() {
	
		if (theAge <=4 && theGender =='b'){
			System.out.println("You're a toddler boy.");
		}
		else if (theAge <=4 && theGender =='g'){
			System.out.println("You're a toddler girl.");
		}
		else {
			System.out.println("You're not a toddler");
		}
		
	}
	
	public void discount() {
		if (theAge<=12 || theAge>=65) {
			System.out.println("You get a movie discount");
		}
		else {
			System.out.println("No movie discount for you");
		}
	}
	
	public void teen() {
		if (theAge>=12 && theAge<=18) {
			System.out.println("You are a teenager");
		}
		else {
			System.out.println("You are not a teenager");
		}
	}
	

	
	public static void main(String args[]) {
	
		humanMethods runner = new humanMethods();
		
		runner.setAge(16);
		
		runner.setGender('b');
		
		runner.canVote();
		
		runner.tetanusShot();
		
		runner.toddler();
		
		runner.discount();
		
		runner.teen();
		

	}

		

}
