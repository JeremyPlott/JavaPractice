import java.util.Scanner;

public class HelloWorldApp {

	public static void main(String[] args) {
		System.out.println("Hello world");
		Scanner sc = new Scanner(System.in);

		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			
			StringBuilder sb = new StringBuilder("Tricia");
			sb.append(" M ");
			sb.append("Good");
			System.out.println(sb);
	
			System.out.println("Enter first name: ");
			String firstName = sc.next();
			System.out.println(firstName);
			
			System.out.println("Enter age: ");
			int age = sc.nextInt();
			System.out.println("Age: " + age);
			
			while (age > 0) {
				System.out.println("Age is:" + age);
				age--;
			}
			System.out.println("Input 'y' to continue:");
			choice = sc.next();
		}		
		sc.close();
	}

}