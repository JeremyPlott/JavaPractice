import java.util.Scanner;

public class JavaPracticeApp2_3 {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the Area and Perimeter Calculator");
		
		Scanner sc = new Scanner(System.in);
		
		String Choice = "y";
		while (Choice.equalsIgnoreCase("y")) {
			double Length = 0;
			double Width = 0;
			
			System.out.println("Enter length: ");
			Length = sc.nextDouble();
			System.out.println("Enter width: ");
			Width = sc.nextDouble();
			System.out.println("Area: " + (Length * Width));
			System.out.println("Perimeter: " + ((Length * 2) + (Width * 2)));
			
			System.out.println("Continue? y/n");
			Choice = sc.next();
		}		
		sc.close();
	}
}
