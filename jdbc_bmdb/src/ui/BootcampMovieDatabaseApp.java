package ui;

import java.util.ArrayList;
import java.util.List;

import db.ActorDB;
import model.Actor;

public class BootcampMovieDatabaseApp {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the BMDB App");
		
		List<Actor> actors = new ArrayList<>();
		ActorDB actorDB = new ActorDB();
		
		actors = actorDB.getAll();
		System.out.println("List all actors: ");
		System.out.println("=====================");
		for (Actor a: actors) {
			System.out.println(a);
		}
		
		System.out.println("Bye");

	}

}
