package ex_06_Switch_Statement;

import java.util.Scanner;

public class Lab_059_CheckVowel_Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().toLowerCase().charAt(0);
		switch(ch)
		{
		case 'a', 'e', 'i', 'o', 'u' -> System.out.println(ch+ " is a vowel");
		default -> System.out.println(ch+" is a consonant");
		}
		

	}

}
