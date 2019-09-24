import java.util.Scanner;

public class JavaPracticeApp2_2 {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the Letter Grade Converter");
		
		Scanner sc = new Scanner(System.in);
		
		String lettGra = "";
		
		String Choice = "y";
		while (Choice.equalsIgnoreCase("y")) {
			
			int numGra = 0;
			System.out.println("Please enter grade (0-100)");			
			numGra = sc.nextInt();
			
			if(0 > numGra || numGra > 100) {
				System.out.println("Grade must be from 0-100");
				Choice = "y";
			}					
			if(numGra >= 0 && numGra <= 59) {
				lettGra = "F";
			}
			if(numGra >= 60 && numGra <= 66) {
				lettGra = "D";
			}
			if(numGra >= 67 && numGra <= 79) {
				lettGra = "C";
			}
			if(numGra >= 80 && numGra <= 87) {
				lettGra = "B";
			}
			if(numGra >= 88 && numGra <= 100) {
				lettGra = "A";
			}
			
			System.out.println("Letter Grade: "+lettGra);
			System.out.println("Continue? y/n");
			Choice = sc.next();
		}
		sc.close();

	}

}
