package ex_06_Switch_Statement;

public class Lab_043_SwitchInterview_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		switch(-1) 
		{
		case -1: System.out.println(10);
		break;
		case 10 :System.out.println(11);
		break;
		default : System.out.println("20");
		break;
		// case -1 will be executed, a=10 is not used anywhere
		}
	}

}
