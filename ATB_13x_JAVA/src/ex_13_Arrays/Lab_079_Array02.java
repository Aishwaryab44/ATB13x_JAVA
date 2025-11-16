package ex_13_Arrays;

public class Lab_079_Array02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] marks = {91,92,93,85}; // 1st way
		
		int [] marks1= new int[5];//fixed size
		//One dimensional Array
		String [] names = new String[5]; //fixed size 5 index 0 to 4
		names[0]="Aishwarya";
		names[1] = "Snehal";
		names[2] = "Dipali";
		names[3] = "Reyansh";
		names[4] = "Vivan";
		//names[7]= "XYZ"; //Array Index out of bound
		System.out.println(names[0]);
		System.out.println(names[4]);
	}

}
