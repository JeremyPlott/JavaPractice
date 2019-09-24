import java.util.Scanner;

public class JavaPracticeApp5_3 {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the Guess the Number Game");
		System.out.println("++++++++++++++++++++++++++++++++++++");
		System.out.println();
		System.out.println("I'm thinking of a whole number between 1 and 100");
		System.out.println("Try to guess it");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		int target = (int) (Math.random()*100 + 1);
		int tries = 0;
		String choice = "y";
		int guess = 0;			
		
		int record = 0;
		
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("Guess a number: ");
			try {
			guess = Math.abs(sc.nextInt());
			} catch (Exception e){
				System.out.println("Please enter a whole positive integer between 1 and 100");
			}
			
				while (guess != target) {
					
					tries++;
					
					int distance = target - guess;
					String scale = "Too ";
					String lowHigh = "";
					if (Math.abs(distance) > 30) {
						scale = "Way too ";
					}
					if (distance < 0) {
						lowHigh = "high";
					} else {
						lowHigh = "low";
					}
					
					System.out.println(scale + lowHigh + ". Guess again");
					System.out.println();
					guess = sc.nextInt();
				
				}
				
				System.out.println("Nice! You did it in "+ tries + " attempts.");
				
				if(record == 0) {
					record = tries;				
				}
				if (tries < record) {
					record = tries;
				}
				System.out.println("The current record from this session is " + record + " attempts");
				
				System.out.println("Play again? y/n");
				target = (int) (Math.random()*100 + 1);
				tries = 0;
				choice = sc.next();
			}			
	}
}
