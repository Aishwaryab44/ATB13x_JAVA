package ex_05_If_Condition;

public class Lab_035_If_Condition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = Integer.parseInt(args[0]); //CLI input
		if(age>18)
		{
			System.out.println("Can Vote");
		}
		else 
			System.out.println("Can not vote");
	}

}
