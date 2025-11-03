package ex_06_Switch_Statement;

public class Lab_040_SwitchInterview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch ='A'; //switch must be int, long, byte, short
		//char is also an iteger
		switch(ch)
		{
		case 65: 
			System.out.println("Match ASCII");
			break;
		default:
			System.out.println("Unmatched");
			break;
		}
	}

}
