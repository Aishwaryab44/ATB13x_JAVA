package ex_06_Switch_Statement;

import java.util.Scanner;

public class Lab_039_SwitchwithoutBreak {


			public static void main(String[] args) {
				// TODO Auto-generated method stub
				// enter day from 1-7 : Mon-Sunday
				// if 8 -> error
				// IF break not used, all the conditions will be executed till the expected condition is achieved
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the number between 1-7");
				int num = sc.nextInt();
				switch (num)
				{
				case 1 : 
					System.out.println("Monday");
					
				case 2 : 
					System.out.println("Tuesday");
					
				case 3 : 
					System.out.println("Wednesday");
					
				case 4 : 
					System.out.println("Thursday");
					
				case 5 : 
					System.out.println("Friday");
					
				case 6 : 
					System.out.println("Saturday");
					
				case 7 : 
					System.out.println("Sunday");
				default :
					System.out.println("Enter a valid number between 1 to 7");
				}
				
			}

		}

