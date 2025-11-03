package ex_06_Switch_Statement;

public class Lab_042_Switch_MultipleMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch =001;
		switch(ch)
		{
			case 001,003 : 
				System.out.println("One ");
			System.out.println("Two");
			
			break;
			case 005,004:
				System.out.println("Three");
			System.out.println("Four");
			break;
			default:
				System.out.println("Error");
				
		}

	}

}
