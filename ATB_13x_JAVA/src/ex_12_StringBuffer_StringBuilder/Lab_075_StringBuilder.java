package ex_12_StringBuffer_StringBuilder;

public class Lab_075_StringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder str_bldr = new StringBuilder("Hello World");
		System.out.println(str_bldr);
		str_bldr.append("123");
		str_bldr.reverse();
		System.out.println(str_bldr);

	}

}
