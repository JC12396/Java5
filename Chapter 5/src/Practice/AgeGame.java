package Practice;

import java.util.Scanner;

public class AgeGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your age >> ");
		age = input.nextInt();
		
		if (age <= 12)
		{
			System.out.println("WHY ARE YOU HERE!!!");
		}
		else if (age >= 13 && age <= 18)
		{
			System.out.println("yay highschool");
		}
		else if (age >= 19 && age <= 25)
		{
			System.out.println(" College is fun!!!");
		}
		else if (age >= 26 && age <= 30)
		{
			System.out.println("College was fun!!!");
		}
		else if (age >= 31 && age <= 40)
		{
			System.out.println("JOBS ARE HARD!!!");
		}
		else if (age >= 41 && age <= 50)
		{
			System.out.println("Are YOU MARRIEd");
		}
		else if (age >= 51 && age <= 60)
		{
			System.out.println("Retire already");
		}
		else if (age >= 61 && age <= 1004)
		{
			System.out.println("WHY ARE YOU HERE!!!");
		}
		else
			System.out.println("Are you human");
	}

}
