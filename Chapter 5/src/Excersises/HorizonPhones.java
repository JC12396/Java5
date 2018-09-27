package Excersises;

import java.util.Scanner;

public class HorizonPhones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double planA = 49.00;
		double planB = 55.00;
		double planC = 61.00;
		double planD = 70.00;
		double planF = 87.00;
		double planE = 79.00;
		double min;
		double data;
		double text;
		int planChoice;
		
		Scanner input  = new Scanner(System.in);
		
		System.out.println("How much minutes of talk do you need a month? >> ");
		min = input.nextDouble();
		System.out.println("How many texts do you need a month? >> ");
		text = input.nextDouble();
		System.out.println("How much data do you need a month? >> ");
		data = input.nextDouble();
		
		if (min <= 500 && text == 0 && data == 0)
		{
			System.out.println("The best plan for you is Plan A for $" + planA + " a month.");
		}
		else if (min <= 500 && text > 0 && data == 0)
		{
			System.out.println("The best plan for you is Plan B for $" + planB + " a month.");
		}
		else if (min >= 500 && data == 0)
		{
			System.out.println("There are 2 plans for you, Plan C for $" + planC + " a month with up to 100 text messages or Plan D for $." + planD + " a month with 100 or more!");
			System.out.println("What plan would you like?\n1 - Plan C\n2 - Plan D");
			planChoice = input.nextInt();
			if (planChoice == 1)
			{
				System.out.println("Thank you for choosing Plan C!");
			}
			else if (planChoice == 2)
			{
				System.out.println("Thank you for choosing Plan D!");
			}
			else
			{
				System.out.println("INVALID");
			}
		
		}
		else if (data > 0 )
		{
			System.out.println("There are 2 plans for you, Plan E for $" + planE + " a month with up to 2 gigabytes or Plan F for $" + planF + " a month with 2 or more!");
			System.out.println("What plan would you like?\n1 - Plan E\n2 - Plan F");
			planChoice = input.nextInt();
			if (planChoice == 1)
			{
				System.out.println("Thank you for choosing Plan E!");
			}
			else if (planChoice == 2)
			{
				System.out.println("Thank you for choosing Plan F!");
			}
			else
			{
				System.out.println("INVALID");
			}
		}
		else 
		{
			System.out.println("INVALID");
		}
	}

}
