package ex_04_Increment_Decrement;

public class Lab025_ID_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a= 10;
        System.out.println(++a);
        System.out.println(a);
        
      //Expression & Result Table
//		Line No | a | Result b
//		7 | 10 | NA
//		8 | 11 | 11
//		15 | 11 | 11 


        // // POST increment  = Print first and then increase
        int a_post = 10;
        System.out.println(a_post++);
        System.out.println(a_post);
      //Expression & Result Table
//		Line No | a | Result b
//		13 | 10 | NA
//		14 | 11 | 10
//		15 | 11 | 11 
        
        int a1 = 10;
        int result = ++a1;
        System.out.println(a1);
        System.out.println(result);
        
      //Expression & Result Table
//		Line No | a1 | Result result
//		28 | 10 | NA
//		29 | 11 | 10
//		30 | 11 | NA
//        31 | NA | 11
	}

}
