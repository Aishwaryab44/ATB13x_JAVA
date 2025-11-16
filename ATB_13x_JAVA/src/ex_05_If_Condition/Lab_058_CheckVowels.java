package ex_05_If_Condition;

import java.util.Scanner;

public class Lab_058_CheckVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character");
		char c = sc.next().toLowerCase().charAt(0);
		if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c =='u')
		{
			System.out.println(c  + "\nIs a vowel");
		}else if(c>='a' && c<='z') 
		{
			System.out.println(c +"\nIs a consonant");
		}
		else
		{
			System.out.println("\nInvalid Char");
		}
		
		

	}

}
