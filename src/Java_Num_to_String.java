import java.util.Date;

public class Java_Num_to_String {

	public static void main(String[] args) {
		
		char c = 'z';
		boolean bool =true;
		byte b = 127;
		short s = 32000;
		int i = 2000000;
		long l = 16500000L;
		float f = 1234245.435234f;
		double d = 112312312331.34d;

		System.out.println("The value of c : "+c);
		System.out.println("The value of bool : "+bool);
		System.out.println("The value of b : "+b);
		System.out.println("The value of s : "+s);
		System.out.println("The value of i : "+i);
		System.out.println("The value of l : "+l);
		System.out.println("The value of f : "+f);
		System.out.println("The value of d : "+d);
		System.out.println("The value of s : "+ s);
		System.out.println(s+"The value of s : ");
		System.out.println(2+2+"The value of s : ");
		
		Date nDate = new Date();
		System.out.println("the Date is : "+nDate);

	}

}
