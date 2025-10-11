package javabasics;

public class Lab002_DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 250;
		byte b = 10; //byte b = 128 invalid	//10->8bits->00001010
		char c = 'A';
		short d = 90;
		long num = 7387308017l; // add l or L at last for long
		float pi = 3.4f; //add f or F at the end for float
		System.out.print("Print the output without a new line");
		System.out.println("Add a new line in the end");
		System.out.printf("Your variable name is %d", b); //printf is used to format the output
		/*
		 * %d-> int, byte, long, short, %s-> string %f-> float %b->boolean
		 */		
		
		int e = 25;
		System.out.printf("\n Sum of variable a and e is : %d + %d", a,e);

	}

}
