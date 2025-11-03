package ex_06_Switch_Statement;

import java.util.Scanner;

public class Lab_038_switch01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// enter day from 1-7 : Mon-Sunday
		// if 8 -> error
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number between 1-7");
		int num = sc.nextInt();
		switch (num)
		{
		case 1 : 
			System.out.println("Monday");
			break;
		case 2 : 
			System.out.println("Tuesday");
			break;
		case 3 : 
			System.out.println("Wednesday");
			break;
		case 4 : 
			System.out.println("Thursday");
			break;
		case 5 : 
			System.out.println("Friday");
			break;
		case 6 : 
			System.out.println("Saturday");
			break;
		case 7 : 
			System.out.println("Sunday");
			break;
		default :
			System.out.println("Enter a valid number between 1 to 7");
			break;
		}
		
	}

}
