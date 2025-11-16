package ex_12_StringBuffer_StringBuilder;

import java.util.Scanner;

public class Lab_076_StringBuilder_Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String input = sc.next();
		
		String newStringReversed = reverse_string(input);
		
		if(newStringReversed.equalsIgnoreCase(input))
		{
			System.out.println("Entered string is a Palindrome");
		}
		else
		{
			System.out.println("Entered string is not a Palindrome");
		}
	}
	static String reverse_string(String userInput) {
		StringBuilder str_bldr = new StringBuilder(userInput);
		return str_bldr.reverse().toString();
		
		
	}

}
