package Excersises;

import java.util.Scanner;

public class Pay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int skillChoice;
		int medChoice;
		int dentChoice;
		int disChoice;
		int insuranceChoice;
		int retireChoice;
		double skill2 = 20.00;
		double skill3 = 22.00;
		double skill1 = 17.00;
		double medIns = 32.50;
		double dental = 20.00;
		double disability = 10.00;
		double hours;
		double overtime = 0;
		
		Scanner input  = new Scanner(System.in);
		
		System.out.println("What is the worker's skill level?\n1 - Skill level 1\n2 - Skill level 2\n3 - Skill level 3");
		skillChoice = input.nextInt();
		if (skillChoice == 1 )
		{
			System.out.println("How many hours did they work?");
			hours = input.nextInt();
			if (hours > 40)
			{
				overtimePay1(overtime, hours, skill1);
			}
			else if (hours <= 40)
			{
				regularPay1(hours, skill1);
			}
			else
			{
				System.out.println("INVALID");
			}
		}
		else if (skillChoice == 2 )
		{
			System.out.println("How many hours did they work?");
			hours = input.nextInt();
			if (hours > 40)
			{
				overtimePay2(overtime, hours, skill2);
			}
			else if (hours <= 40)
			{
				regularPay2
			}
			
		}
		else if (skillChoice == 3 )
		{
			System.out.println("How many hours did they work?");
			hours = input.nextInt();
		}
		else
		{
			System.out.println("INVALID");
		}
		
		
		
		
	}
	public static void overtimePay1(double overtime,double hours, double skill1)
	{
		double overtimePay;
		double totalPay;

		
		overtime = hours - 40;
		overtimePay = overtime * (skill1 * 1.5);
		totalPay = overtimePay + (hours * skill1);
		
		System.out.println("Your worker earned $" + totalPay + "\nThe average weekly pay is $680\nThey earn $17.00/h\nThey earned $" + overtimePay +" in overtime pay\nTheir over time pay rate is $25.50/h\nThey worked " + hours + " hours\nTHey had no deductions");
	}
	public static void regularPay1(double hours, double skill1)
	{
		double pay; 
		
		pay = hours * skill1;
		
		System.out.println("Your worker earned $" + pay + "\nThe average weekly pay is $680\nThey earn $17.00/h\nThey earned $0 in overtime pay\nTheir over time pay rate is $25.50/h\nThey worked " + hours + " hours\nThey had no deductions");
	}
	public static void regularPay2(double hours, double skill2)
	{
		double pay; 
		
		pay = hours * skill2;
		
		System.out.println("Your worker earned $" + pay + "\nThe average weekly pay is $800\nThey earn $20.00/h\nThey earned $0 in overtime pay\nTheir over time pay rate is $30.00/h\nThey worked " + hours + " hours\n");
	}
	public static void regularPay3(double hours, double skill3)
	{
		double pay; 
		
		pay = hours * skill3;
		
		System.out.println("Your worker earned $" + pay + "\nThe average weekly pay is $680\nThey earn $17.00/h\nThey earned $0 in overtime pay\nTheir over time pay rate is $25.50/h\nThey worked " + hours + " hours\nThey had no deductions");
	}
	public static void overtimePay2(double overtime,double hours, double skill2)
	{
		double overtimePay;
		double totalPay;

		
		overtime = hours - 40;
		overtimePay = overtime * (skill2 * 1.5);
		totalPay = overtimePay + (hours * skill2);
		
		System.out.println("Your worker earned $" + totalPay + "\nThe average weekly pay is $680\nThey earn $17.00/h\nThey earned $" + overtimePay +" in overtime pay\nTheir over time pay rate is $25.50/h\nThey worked " + hours + " hours");
	}
	public static void overtimePay3(double overtime,double hours, double skill3)
	{
		double overtimePay;
		double totalPay;

		
		overtime = hours - 40;
		overtimePay = overtime * (skill3 * 1.5);
		totalPay = overtimePay + (hours * skill3);
		
		System.out.println("Your worker earned $" + totalPay + "\nThe average weekly pay is $680\nThey earn $17.00/h\nThey earned $" + overtimePay +" in overtime pay\nTheir over time pay rate is $25.50/h\nThey worked " + hours + " hours");
	}

}
