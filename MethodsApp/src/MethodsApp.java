import java.util.Scanner;

public class MethodsApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter #: ");
		int n1 = 0;
		try {
			n1 = sc.nextInt();
		}
		catch (Exception e) {
			System.out.println("n1 must be a number");
			//clear remaining content in scanner
			sc.nextLine();
		}
		System.out.println("Enter next #: ");
		int n2 = 0;
		if (sc.hasNextInt()) {
			n2 = sc.nextInt();
		} else {
			System.out.println("n2 must be a number");
			sc.nextLine();
		}
		
		int sum = sumIt(n1, n2);
		System.out.println("Sum = "+sum);
		
		System.out.println("Sum 3");
		System.out.println(sumIt(2,4,5));
		
		System.out.println("Bye");
		sc.close();
	}
	
	private static int sumIt(int a, int b) {
		return a + b;
	}
	private static int sumIt(int a, int b, int c) {
		return a + b + c;
	}
	private static int sumIt(int a, int b, int c, int d) {
		return a + b + c + d;
	}

}
