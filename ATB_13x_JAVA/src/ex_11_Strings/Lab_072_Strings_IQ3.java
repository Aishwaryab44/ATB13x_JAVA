package ex_11_Strings;

public class Lab_072_Strings_IQ3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Hello";
		String s2 = "Hello";
		String s10 = "hello";
		
		// strings in SCP = 1 as "Hello"
		
		String s3 = new String("Hello");
		String s4 = new String("Hello");
		String s5 = new String("Hello");
		// strings in OA = 3
		// == strings comparison to check location reference
		System.out.println(s1 == s3);
		System.out.println(s1 == s4);
		System.out.println(s1==s2);
		System.out.println(s4 == s5);
		// equals check content 
		
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s10)); //case sensitivity so not equals
		System.out.println(s1.equalsIgnoreCase(s10));
		// equalsIgnore -> Pramod, pramod, PRamoD,
		// == checks location
		// = assignment
	}

}
