package ex_10_Functions;

public class Lab_063_UserDefined_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = sum_of_numbers(22,23);
		System.out.println(result);
		sum_no_return(5,6);
	}
	static int sum_of_numbers(int a , int b)
	{
		return a+b;
	}
	
	static void sum_no_return(int a, int b)
	{
		System.out.println(a+b);
	}

}
