package Excersises;

import java.util.Scanner;

public class condos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		int choice2 = 0;
		int garage;
		double park = 150000.00;
		double golf = 175000.00;
		double lake = 210000.00;
		double price;
		double result = 0;
		
		Scanner input  = new Scanner(System.in);
		
		do {
			System.out.println("Welcome please press 1 for park view, 2 for golf view, or 3 for lake view.");
			choice = input.nextInt();
			
			if (choice == 1)
			{
				System.out.println("Thank you for choosing the park view condo the price will be $" + park);
				System.out.println("Would you like an add-on of a garage or a parking space? 1 - Garage 2 - Parking Space");
				garage = input.nextInt();
				price = 150000;
				if (garage == 1)
				{
					price = park + 5000.00;
					result = price;
				}
				else
				{
					System.out.println("Parking space it is");
				}
			}
			else if (choice == 2)
			{
				System.out.println("Thank you for choosing the golf view condo the price will be $" + golf);
				System.out.println("Would you like an add-on of a garage or a parking space? 1 - Garage 2 - Parking Space");
				garage = input.nextInt();
				price = 175000;
				if (garage == 1)
				{
					price = park + 5000.00;
					result = price;
				}
				else
				{
					System.out.println("Parking space it is");
				}
			}
			else if (choice == 3)
			{
				System.out.println("Thank you for choosing the lake view condo the price will be $" + lake);
				System.out.println("Would you like an add-on of a garage or a parking space? 1 - Garage 2 - Parking Space");
				garage = input.nextInt();
				price = 210000;
				if (garage == 1)
				{
					price = park + 5000.00;
					result = price;
				}
				else
				{
					System.out.println("Parking space it is");
				}
			}
			else
			{
				System.out.println("Invalid Input");
				price = 0.00;
			}
			result(result);
			System.out.println("Would you like to see another condo price? 1 for yes and 2 for no >>");
			choice2 = input.nextInt();
		}while(choice2 != 2);
		
	}
	public static void result(double result)
	{
		System.out.println("$" + result);
	}

}
