package ex_10_Functions;

import java.util.Scanner;

public class Lab_066_Function_Arith_operations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		//int a = sc.nextInt();
		//Step 3: Find and fix the edge cases
		int a =0;
		if(sc.hasNextInt())
		{
			a =sc.nextInt();
		}
		else
		{
			System.out.println("Please enter an integer only");
			
			//return; //system.exit(0)
			System.exit(0);
		}
		
		//Step 3: Find and fix the edge cases
		System.out.println("Enter trhe second number");
		//int b = sc.nextInt();
		int b =0;
		if(sc.hasNextInt())
		{
			b=sc.nextInt();
		}
		else
		{
			System.out.println("Please enter an integer only");
		}
		//Step 2 : Create rough logic ->fucntions
		
		//Find and fix the edge cases
		
		int result_sum = sum(a,b);
		int result_sub = sub(a,b);
		int result_mult = mult(a,b);
		int result_div = div(a,b);
		int result_mod = mod(a,b);
		
		System.out.println("Addition is: "+result_sum);
		System.out.println("Subtraction is:" +result_sub);		
		System.out.println("Multiplication is:" +result_mult);
		System.out.println("Division is:" +result_div);
		System.out.println("Modulus is:" +result_mod);		

	}
	static int sum (int a, int b)
	{
		return a+b;
	}
	
	static int sub(int a, int b)
	{
		return a-b;
		
	}
	
	static int mult(int a, int b)
	{
		return a*b;
	}
	
	static int div(int a, int b)
	{
		// if b is 0, exception will be thrown
		if(b==0)
		{
			throw new ArithmeticException("B cannot be zero!!!!!!");
			// OR
			//System.out.println("B cannot be zero!!!!");
			//System.exit(0);
		}
		
		return a/b;
	}
	
	static int mod(int a, int b)
	{
		return a % b;
	}
	

}
