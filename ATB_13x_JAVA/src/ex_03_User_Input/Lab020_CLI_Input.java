package ex_03_User_Input;

public class Lab020_CLI_Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int age = 10; change data type to string
		String age_string = args[0];
		System.out.println(age_string);
		int age = Integer.parseInt(age_string);
		String canIvote= age>18 ? "Yes" : "No";
		System.out.println(canIvote);
		//must pass arguments using CLI else will get exception

	}

}
