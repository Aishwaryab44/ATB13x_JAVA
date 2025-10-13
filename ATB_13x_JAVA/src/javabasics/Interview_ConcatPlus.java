package javabasics;

public class Interview_ConcatPlus {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		// + acts differently with different data types
		// + with int performs sum, + with strings performs concatenation
		String fname ="Aishwarya";
		String lname = "Bhalerao";
		int a = 10;
		int b = 20;
		System.out.println(fname+lname+a+b); //here 1st is concatenation hence 2nd plus is also concatenation
		System.out.println(a+b+fname+lname); // here 1st is addition and next is concatenation
		System.out.println(fname + lname + (a+b)); //BODMAS: bracket, order,division, multi, add, sub
		System.out.println((9 * 3 / 9 + 1 )* 3); //first bracket multiplication-> division-> addition, outer multiplication
		
}
}