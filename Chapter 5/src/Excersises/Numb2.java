package Excersises;

import java.util.Scanner;

public class Numb2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		int num2;
		int num3;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number >> ");
		num1 = input.nextInt();
		System.out.println("Enter another number >> ");
		num2 = input.nextInt();
		System.out.println("Enter one last number >> ");
		num3 = input.nextInt();
		
		if (num1 <= num2 && num1 <= num3)
		{
			if (num2 <= num3)
			{
				System.out.println(num1 + ", " + num2 + ", " + num3);
			}
			else
			{
				System.out.println(num1 + ", " + num3 + ", " + num2);
			}
		}
		else if (num2 <= num1 && num2 <= num3)
		{
			if (num1 <= num3)
			{
				System.out.println(num2 + ", " + num1 + ", " + num3);
			}
			else
			{
				System.out.println(num2 + ", " + num3 + ", " + num1);
			}
		}
		else if (num3 <= num1 && num3 <= num2)
		{
			if (num2 <= num1)
			{
				System.out.println(num3 + ", " + num2 + ", " + num1);
			}
			else
			{
				System.out.println(num3 + ", " + num1 + ", " + num2);
			}
		}
		else
		{
			System.out.println("DIE");
		}
	}

}
