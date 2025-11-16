package ex_12_StringBuffer_StringBuilder;

public class Lab_075_StringBuffer_Functions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer ("Java"); 
		sb.append(" Programming");
		System.out.println(sb);
		sb.delete(5, 16);
		System.out.println(sb);
		sb.replace(0, 4, "C++");
		System.out.println(sb);
		
	}

}
