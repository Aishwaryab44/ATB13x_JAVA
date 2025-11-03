package ex_03_User_Input;

import java.util.Scanner;

public class Lab023_ScannerInput2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter an integer");
		int age = sc.nextInt();
		System.out.println(age);
		
		System.out.println("Enter a String");
		String name = sc.next();
		System.out.println(name);
		

		System.out.println("Enter the Double");
		double num = sc.nextDouble();
		System.out.println(num);
		
	}

}
