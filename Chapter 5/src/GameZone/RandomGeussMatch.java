package GameZone;

import java.util.Scanner;

public class RandomGeussMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int random;
		int userInput;
		int quit = 0;
		
		String result = null;
		
		random = 1 + (int)(Math.random() * 10);
		
		Scanner input  = new Scanner(System.in);
		do {
			System.out.println("Please enter a number from 1 to 10 >> ");
			userInput = input.nextInt();
		
			if (random > userInput)
			{
				result = "Number is too low!";
			}
			else if (random < userInput)
			{
			result = "The input was too high!";
			}
			else if (random == userInput)
			{
				result = "You win!!";
			}
			display(result);
			
			System.out.println("Do you want to quit 1 - Yes or 2 - No");
			quit = input.nextInt();
			
			}while(1 != quit || userInput == random);
	}
	public static void display(String result)
	{
		System.out.println(result);
	}

}
