package ex_10_Functions;

public class Lab_064_UserDefined_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Type1: Without parameters and without return type
		//call
		wo_pr_rt();
		
		// Type2: Without parameters and with return type
		//call
		String msg = wo_pr_wi_rt();
		System.out.println(msg);
		
		// Type3: With parameters and without return type 90%used
		wi_pr_wo_rt("Aishwarya",28,35000);
		wi_pr_wo_rt("Snehal",37,150000);
		
		//Type4: With parameters and with return type
		int sum = wi_pr_wi_rt(4,5);
		System.out.println("The sum of 2 numbers is "+sum);
	}
	// Type1: Without parameters and without return type
	//Declaration
		static void wo_pr_rt()
		{
			System.out.println("Type 1 :This method is without parameter and without return type");
			System.out.println("Hi, How are you?");
		}
		
		
		// Type2: Without parameters and with return type
		static String wo_pr_wi_rt() 
		{
			System.out.println("Type 2 :This method is without parameter and with return type");
			System.out.println();
			return "Hi,how are you?";
			
		}
		// Type3: With parameters and without return type
		static void wi_pr_wo_rt(String name, int age, double sal) 
		{
			System.out.println("Type 2 :This method is with parameter and without return type");
			System.out.println("Your name is:" +name+ "\nYour age is:" +age+ "\nYour salary is:" +sal );
			
			
			
		}
		
		
		//Type4: With parameters and with return type
		static int wi_pr_wi_rt(int a, int b) {
			System.out.println("Type 3 :This method is with parameter and with return type");
			return a+b;
		}

	}


