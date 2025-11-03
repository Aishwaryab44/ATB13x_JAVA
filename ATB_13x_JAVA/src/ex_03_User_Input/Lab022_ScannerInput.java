package ex_03_User_Input;

import java.util.Scanner;

public class Lab022_ScannerInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the age");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		
		String canIvote= age>18 ? "Yes" : "No";
		System.out.println(canIvote);

	}

}
