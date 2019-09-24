import java.util.Scanner;

public class JavaPracticeApp3_3 {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the Travel Time Calculator!");
		
		String choice = "y";
		Scanner sc = new Scanner(System.in);
		
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("Enter miles: ");
			double miles = sc.nextInt();
			
			System.out.println("Enter MPH: ");
			double mph = sc.nextInt();
						
			int hours = (int)(miles / mph);
			double minutes = (int)((miles % mph)*60);
			
			System.out.println("Estimated travel time");
			System.out.println("=====================");
			System.out.println("Hours: " + hours);
			System.out.println("Minutes: " + minutes);
			
			System.out.println("Continue? y/n");
			choice = sc.next();
			
		}
		
		sc.close();
		System.out.println("Happy travels!");

	}

}
