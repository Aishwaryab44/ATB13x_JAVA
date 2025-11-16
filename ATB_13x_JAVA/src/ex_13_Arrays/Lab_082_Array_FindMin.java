package ex_13_Arrays;

public class Lab_082_Array_FindMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array2 = {111,102,201,505,566,202,32,343,454,450};
		int min = find_min(array2);
		System.out.println(min);

	}
	static int find_min(int [] array2)
	{
		int min = array2[0];
		for(int i =0;i<array2.length;i++)
		{
			if(array2[i]<min)
			{
				min = array2[i];
			}
		}
		return min;
	}

}
