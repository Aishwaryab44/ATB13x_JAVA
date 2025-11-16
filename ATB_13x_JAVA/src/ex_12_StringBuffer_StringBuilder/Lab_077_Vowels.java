package ex_12_StringBuffer_StringBuilder;

import java.util.Scanner;

public class Lab_077_Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vowels = 0;
		int consonants = 0;
		
		System.out.println("Enter the String");
		Scanner sc = new Scanner (System.in);
		String one = sc.next();
		one = one.toLowerCase();
		
		for(int i =0; i<one.length();i++)
		{
			char ch = one.charAt(i);
			
			if(ch == 'a' || ch =='e' || ch=='i' ||ch=='o' || ch=='u')
			{
				
				vowels++;
				
			}
			else
			{
				consonants++;
			}
		}
		System.out.println("The total number of vowels is " +vowels);
		System.out.println("The total number of consonants is " +consonants);
		

	}

}
