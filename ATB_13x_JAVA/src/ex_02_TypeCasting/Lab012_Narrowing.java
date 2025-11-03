package ex_02_TypeCasting;

public class Lab012_Narrowing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int val = 300;
		//byte b = val; //narrowing (int->byte) implicit narrowing casting is not allowed
		byte b = (byte)val; //narrowing (int->byte) mention as explicit. explicit narrowing casting is allowed.
		//data loss may occur
		System.out.println(b);
		// 32bits in is converted into 8bit byte
		long num = 7387308017l;
		short num1 = (short)num;
		System.out.println(num1);
	}

}
