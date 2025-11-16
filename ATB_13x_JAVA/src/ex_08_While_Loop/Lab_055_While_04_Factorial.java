package ex_08_While_Loop;

import java.util.Scanner;

public class Lab_055_While_04_Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int factorial = 1;
		if(!sc.hasNextInt())
		{
			System.out.println("Please enter an integer"); //for input< 0
			return;
		}
		if(num<0)
		{
			System.out.println("Negative factorial not allowed");
			return;
		}
		
		if(num<=0)
		{
			System.out.println(factorial);
		}
		else
		{
			for(int i = 1 ; i<=num; i++)
			{
			factorial = factorial*i;
			}
		}
		System.out.println("Factorial is: "+factorial);
	}

}
