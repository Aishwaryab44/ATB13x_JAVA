package ex_02_TypeCasting;

public class Lab013_Narrowing_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int course = 100;
		float gst= 18.45f;
		//int total = course + gst; //implicit narrowing not allowed
		int total = course + (int)gst;
		System.out.println(total); // data loss ie .18
		
		float total2 = course+gst;//widening auto-> implicit //float is bigger
		float total3 = (float)course+ gst; //widening explicit
		System.out.println(total2);
		System.out.println(total3);
		
		
	}

}
