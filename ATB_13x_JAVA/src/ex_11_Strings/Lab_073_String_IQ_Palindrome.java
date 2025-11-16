package ex_11_Strings;

import java.util.Scanner;

public class Lab_073_String_IQ_Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String input = sc.next();
		
		String newStringReversed = reversed_string(input);
		
		if(newStringReversed.equalsIgnoreCase(input))
		{
			System.out.println("Entered string is a Palindrome");
		}
		else
		{
			System.out.println("Entered string is not a Palindrome");
		}
	}
		static String reversed_string(String userInput) {
		
		String reversed_str = "";
		for (int i = userInput.length()-1; i>=0; i-- )
		{
			reversed_str = reversed_str + userInput.charAt(i);
			
		}
		return reversed_str;
	}

}

/*
 * String two; for(int i=one.length()-1;i>=0;i--) { two = one + one.charAt(i);
 * 
 * } //System.out.println(two);
 */
