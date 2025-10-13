package javabasics;

public class Interview_Character_Special_Case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a1 = 'A';
		char a2 = 'B';
		System.out.println(a1+a2);
		//character acts as integer and adds ASCII values in a1+b1
		System.out.println(a1);
		//character acts as char only when alone
		System.out.println('A'== 65); // will compare with ASCII and return boolean result
		
		short s = 10;
		char s1 = 'A';
		System.out.println(s+s1); //acting as an integer

	}

}
