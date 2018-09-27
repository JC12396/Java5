package Practice;

import java.util.Scanner;

public class DoorGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		int chestChoice;
		int bookRoomChoice;
		String result = "Dumb";
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to the amazing door game!");
		System.out.println("I'm your host Steve Harvey!");
		System.out.println("Pick any door!\n1 - Door 1\n2 - Door 2\n3 - Door 3\n >> ");
		choice = input.nextInt();
		
		if (choice == 1)
		{
			System.out.println("Door 1 good Choice, choose among the following chests.");
			System.out.println("1 - For chest 1\n2 - For chest 2");
			chestChoice = input.nextInt();
			if (chestChoice == 1)
			{
				result = "a Pile of Gold!";
			}
			else if (chestChoice == 2)
			{
				result = "just kidding, EMPTY";
			}
			else
			{
				result = " just kidding, now die!!";
			}


		}
		else if (choice == 2)
		{
			result = "a talking donkey!";

		}
		else if (choice == 3)
		{
			result = "a worthles peice of paper!";

		}
		else if (choice == 999)
		{
			System.out.println("You enter a room with three books on a table, choose one");
			System.out.println("1 - For the first book\n2 - For the third book\n3 - For the third book\n >> ");
			bookRoomChoice = input.nextInt();
			if (bookRoomChoice == 1)
			{
				result = "You read it and realize it is the ancient Black Book from Solstheim and close it to not let the ancient Deadra out.";
			}
			else if (bookRoomChoice == 2)
			{
				result = "You read it and figure out it is about the fall of the blades";
			}
			else if (bookRoomChoice == 3)
			{
				result = "As you open it you realize it is a worthless burned book!";
			}
			else if (bookRoomChoice == 4)
			{
				result = "You here footsteps behind you, you grab the books and run and make it out!";
			}
			else if (bookRoomChoice == 5)
			{
				result = "You feel around the table and feel something, but you can't see it. You pick it up and you can see it. It is a spell tome of invisibility";
			}
			else
			{
				result = "You leave the room.";
			}
		}
		else if (choice >= 4 && choice <= 998)
		{
			result = "Plz died";
		}
		displayMessage(result);

	}
	public static void displayMessage(String result)
	{
		System.out.println(result);
	}

}
