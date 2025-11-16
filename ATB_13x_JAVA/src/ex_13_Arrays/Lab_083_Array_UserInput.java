package ex_13_Arrays;

import java.util.Scanner;

public class Lab_083_Array_UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an Array");
		int size = sc.nextInt();
		int [] number_marks = new int[size];
		
		for(int i = 0;i<number_marks.length;i++)
		{
			System.out.println("Enter the Array element");
			number_marks[i] = sc.nextInt();
		}
		
		for(int i =0 ;i<number_marks.length;i++)
		{
		System.out.println(number_marks[i]);
		}
	}

}
