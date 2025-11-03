package ex_05_If_Condition;

import java.util.Scanner;

public class Lab_037_Triangle_IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int side_a, side_b, side_c;
		System.out.println("Enter side A");
		Scanner sc = new Scanner(System.in);
		side_a = sc.nextInt();
		System.out.println("Enter side B");
		side_b = sc.nextInt();
		System.out.println("Enter side C");
		side_c = sc.nextInt();
		
		if (side_a==side_b && side_a==side_c)
		{
			System.out.println("Triangle is equilteral");
		}
		
		else if(side_a==side_b||side_b==side_c||side_c==side_a) 
		{
			System.out.println("Triangle is isoscelus");
		}
		else
		{
			System.out.println("Triangle is scalene");
		}
		

	}

}
