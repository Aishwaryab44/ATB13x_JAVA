package ex_12_StringBuffer_StringBuilder;

public class Lab_074_StringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer str_bfr = new StringBuffer("Hello");
		System.out.println(str_bfr);
		str_bfr.append("How are you?");
		System.out.println(str_bfr);

		System.out.println(str_bfr.reverse());
	}

}
