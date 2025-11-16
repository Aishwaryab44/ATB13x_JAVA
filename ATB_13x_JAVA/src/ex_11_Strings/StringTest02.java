package ex_11_Strings;

import java.util.Scanner;

public class StringTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string 1");
		String str1 = sc.next();
		System.out.println("Enter the string 2");
		String str2 = sc.next();
		System.out.println("Enter the string 3");
		String str3 = sc.next();
		
		System.out.println(str1==str3);
		System.out.println(str1.equals(str3));
		System.out.println(str1.equalsIgnoreCase(str3));
		System.out.println(str1.compareTo(str3));
		
		

	}

}
