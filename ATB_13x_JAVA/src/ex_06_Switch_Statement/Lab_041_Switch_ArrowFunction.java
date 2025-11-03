package ex_06_Switch_Statement;

public class Lab_041_Switch_ArrowFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch=0002;
		switch(ch)
		{
		//Above JDK 13 arrow function is supported
		//Only one line statement is supported
		//Break is not needed
		case 001-> System.out.println("One");
		case 002->System.out.println("Two");
		default->System.out.println("Wrong choice");
		}
	}

}
