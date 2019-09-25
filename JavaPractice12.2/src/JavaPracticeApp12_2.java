import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import util.Console;

public class JavaPracticeApp12_2 {

	public static void main(String[] args) {
		
		String game = "on";
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Wizard Inventory Game");
		System.out.println();
		
		List<String> inv = new ArrayList<>();
		inv.add("Wooden Staff");
		inv.add("Marauder's Map");
		inv.add("Wand of Wonder");
		
		String cmd = Console.getString(getDisplayMenu());
		System.out.println("Enter your action: ");
		cmd = sc.next();
		
		while (!game.equalsIgnoreCase("off")) {
			
			System.out.println();
			System.out.println("Enter your action: ");
			cmd = sc.next();
								
			// show
			if (cmd.equalsIgnoreCase("show")) {
				int invSlot = 1;
				for (String i: inv) {
					System.out.println(invSlot+". "+i);
					invSlot++;
				}
			}			
			
			// grab
			else if (cmd.equalsIgnoreCase("grab")) {
				if (inv.size() > 3) {
					System.out.println("Your bag is too full");
				} else {
					String name = Console.getString("Name: ");
					inv.add(name);
					System.out.println("Picked up " + name);
				}
			}
			
			// edit
			else if (cmd.equalsIgnoreCase("edit")) {
				int nbr = Console.getInt("Inv. slot: ");
				int idxNbr = nbr - 1;
				String updatedName = Console.getString("New item: ");
				inv.set(idxNbr, updatedName);
			}
			
			// drop
			else if (cmd.equalsIgnoreCase("drop")) {
				int nbr = Console.getInt("Inv. slot: ");
				int idxNbr = nbr - 1;
				String dropItem = inv.remove(idxNbr);
				System.out.println("Dropped " + dropItem + ".");
			}
			
			////////////////////////////////
			// end game
			else if (cmd.equalsIgnoreCase("exit")) {				
				game = "off";
			}
			
			else {
				System.out.println("Invalid command '"+cmd+"'. Task failed successfully!");
			}
			
			cmd = Console.getString(getDisplayMenu());
			
		}
		
		System.out.println("Thanks for playing, nerds");
		
	}

	private static String getDisplayMenu() {
		String menu = "COMMAND MENU\n" + 
				"show - Show all items\n" + 
				"grab - Grab an item\n" + 
				"edit - Edit an item\n" + 
				"drop - Drop an item\n" + 
				"exit - Exit program\n" +
				"\n";		
		return menu;
	}
}
