package ex_03_Ternary_Operator;

public class Lab018_Nested_TO_Age_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 73 ;
		//age<18-> minor, age= 18-65-> Adult, age>65->sr citizen
		String result = (age<18) ? "Minor" : ( age< 65) ? "Adult" : "Senior Citizen";
		System.out.println(result);
		
	}

}
