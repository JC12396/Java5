package Practice;

import java.util.Scanner;

public class DoorGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		String result;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to the amazing door game!");
		System.out.println("I'm your host Steve Harvey!");
		System.out.println("Pick any door!\n1 - Door 1\n2 - Door 2\n3 - Door 3\n >> ");
		choice = input.nextInt();
		
		if (choice == 1)
		{
			result = "a Pile of Gold!";
			displayMessage(result);
		}
		else if (choice == 2)
		{
			result = "a talking donkey!";
			displayMessage(result);
		}
		else if (choice == 3)
		{
			result = "a worthles peice of paper!";
			displayMessage(result);
		}
		else
		{
			System.out.println("Please die!");
		}

	}
	public static void displayMessage(String result)
	{
		System.out.println("You won " + result);
	}

}
