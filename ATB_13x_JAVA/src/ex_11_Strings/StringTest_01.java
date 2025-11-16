package ex_11_Strings;

public class StringTest_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a Java program that demonstrates basic string operations including concatenation, length, substring, and character extraction.
		String s = "Hello";
		System.out.println("length of the string" +s+ "is:" +s.length());
		s = s+"World";
		System.out.println("Concatinated string is:"+s);
		System.out.println("First character is:" +s.charAt(0));
		System.out.println("Substring is:"+s.substring(5, 10));
		
	
	}

}
