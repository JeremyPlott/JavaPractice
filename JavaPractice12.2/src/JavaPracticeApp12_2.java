
public class JavaPracticeApp12_2 {

	public static void main(String[] args) {
		
		String game = "on";
				
		System.out.println("Wizard Inventory Game");
		System.out.println();
		System.out.println("COMMAND MENU");
		System.out.println();
		System.out.println("menu - Show command menu");
		System.out.println("show - Show all items");
		System.out.println("grab - Grab an item");
		System.out.println("edit - Edit an item");
		System.out.println("drop - Drop an item");
		System.out.println("exit - Exit program");
		
		String[] inv = new String[4]; 
		String cmd = "menu";
		
		while (game != "off") {
			
			// menu
			
			
			// show
			
			
			// grab
			
			
			// edit
			
			
			// drop
			
			
			if (cmd.equalsIgnoreCase("exit")) {				
				game = "off";
			}
			
		}
		
		System.out.println("Thanks for playing, nerds");
		
	}

}
