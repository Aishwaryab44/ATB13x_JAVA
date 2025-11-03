package ex_01_JavaBasics;

public class Lab007_Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 25;	//int -> datatype, a-> identifier, 25-> literal, = ->assignment operator
		int b = 3;
		float c = 3.0f;
		
		System.out.println("--------------Arithmetic Operator----------");
		//Arithmetic operators: Addition +, -, *, /, % 
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a/c);
		System.out.println(a%b);
		
		System.out.println("--------------Unary Operator----------");
		//Unary Operator + or - before number is unary operator
		int num = +10; //+is optional same as int num=10
		System.out.println(num);
		int num1 = -100; //-100 is a negative number
		System.out.println(num+num1);
		
		
		System.out.println("--------------Relational Operator----------");
		// < Less than >= less than or equals to
		// >greater than >= greater than or equals to 
		// == equal to
		// != not equal to
		// all will result into boolean output
		
		int num2 = 30;
		int num3 = 15;
		boolean result = num2<num3;
		System.out.println(result);
		System.out.println(num2>num3);
		
		System.out.println("--------------logical Operator----------");
		//&&(and), ||(or), !(not)
		
		
		boolean a1 = true;
		System.out.println(!a1);
		System.out.println(!!a1);
		
		boolean a2 = true || false;
		System.out.println(a2);
		
		boolean a3 = true && false;
		System.out.println(a3);
		
		System.out.println("--------------Equals Operator----------");
		//== compare values for primitive datatypes
		System.out.println(10==10);
		System.out.println(10>=10);
		System.out.println(10==20);
		System.out.println(!(10>20));
		
		
		
		
	}

}
