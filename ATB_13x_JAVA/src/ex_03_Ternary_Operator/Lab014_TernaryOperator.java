package ex_03_Ternary_Operator;

public class Lab014_TernaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("EXAMPLE 1");
		int age = 10;
		String canIvote= age>18 ? "Yes" : "No";
		System.out.println(canIvote);
		
		System.out.println("EXAMPLE 2");
		int num = -5;
		String result = num>0 ? "Positive" : "Negative";
		System.out.println(result);

	}

}
