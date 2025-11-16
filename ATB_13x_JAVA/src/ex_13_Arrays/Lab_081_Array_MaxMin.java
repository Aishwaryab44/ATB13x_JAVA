package ex_13_Arrays;

import java.util.Arrays;

public class Lab_081_Array_MaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = {11,12,21,55,56,22,32,33,44,45};
		/*
		 * Arrays.sort(array); //sort in ascending order
		 * System.out.println(array[array.length-1]); //array[array.length-1] points to
		 * the last index
		 */
		int max=find_max(array);
		System.out.println(max);
	}
	static int find_max(int [] array)
	{
		int max = array[0];
		for(int i = 0; i<array.length; i++)
		{
			if(array[i]>max)
			{
				max = array[i];
			}
		}
		return max;
		
	}

}
