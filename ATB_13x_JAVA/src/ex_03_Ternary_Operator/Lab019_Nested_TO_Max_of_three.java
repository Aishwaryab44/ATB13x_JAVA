package ex_03_Ternary_Operator;

public class Lab019_Nested_TO_Max_of_three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//find max between 3 numbers using nested TO
		/*
		 * 1. Step 1 ->. Find the inputs and outputs - data types and what is the
		 * exactly the out put interviewer looking. 
		 * 2. Step 2 - Rough logic , brute
		 * force - > explain it side by side. 
		 * 3. Step 3 - Write the logic and present
		 * the solution (Dry Run) 
		 * 4. Step 4 - Optimize and discussion.
		 */ 
		// Step1 : Input -> num1, num2, num3-> int, Output -> String ->max
		//Step2: Rough Logic, num1>num2 & num1>num3-> num1 is max, num2>nu1& num2>num3 -> num2 is max, else num3 is max
		int n1 = 10;
		int n2 = 15;
		int n3 = 20;
		int max = (n1>n2) ? (n1>n3) ? n1:n3 : (n2>n3) ? n2: n3; //A: B;
		System.out.println(max);
		// A -> (n1>n3) ? n1:n3
		// B -> (n2>n3) ? n2: n3 
	}

}
