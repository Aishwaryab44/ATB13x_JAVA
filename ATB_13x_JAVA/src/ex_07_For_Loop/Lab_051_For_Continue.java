package ex_07_For_Loop;

public class Lab_051_For_Continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i <= 50; i++)
		{
			if (i == 5)
			{
				continue; //continue skips the code 
			}
		
			System.out.println(i);
		}
}
}
