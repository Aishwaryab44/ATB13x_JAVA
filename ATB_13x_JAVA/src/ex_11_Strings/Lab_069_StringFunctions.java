package ex_11_Strings;

public class Lab_069_StringFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "ABCD";
		String s2 = "XYZ";
		System.out.println(s1);
		System.out.println(s1.length()); //counts length starting from 1
		System.out.println(s1.concat("XYZ")); //appends this string to the first string
		System.out.println(s1.toLowerCase()); //converts to lower case
		System.out.println(s1.toUpperCase()); //convert to uppercase
		System.out.println(s1.charAt(2)); //finds the character at the given index staring from 0
		System.out.println(s1.contains("BC"));//check if the passes characters are present in the string 1
		System.out.println(s1.equals(s2)); //checks if the content is same
		System.out.println(s1.equalsIgnoreCase("abcd"));//checks content and ignores the case
		System.out.println(s1.indexOf("B")); // finds the indext of given char
		System.out.println("Hello".length());
		System.out.println("Hello".substring(1, 4));
		
		String s3 = "madam";
		System.out.println(s3.lastIndexOf("m"));//finds the last index of 'm'
		System.out.println(s3.replace('m', 'n')); //replaces character at the given index
		
		String s4 = "Aishwarya@Bhalerao@gmail.com";
		String [] splitted=s4.split("@"); //splits the string at @
		
		System.out.println(splitted[0]); //piece1
		System.out.println(splitted[1]); //piece 2
		System.out.println(splitted[2]); //piece3
		
		String s5 = "Aishwarya";
		//substring()
		System.out.println(s5.substring(4)); //printing string from 4th index
		
//String basically means cutting down the string based on the beginning and the end index, whereas the Split basically means cutting down a string based on a pattern or a delimiter. 

		String s6 = "Niagara , O roar again!";
		String substring= s6.substring(11, 16); //print string after 11th index and before 16th
		System.out.println(substring);
		
		
	}

}
