package exceptionHandling;

public class ArithmaticException {

	public static void main(String[] args) {
		
		try {
			int a =6;
			int b=0, c;
			c=a/b;
			System.out.println(c);
		}
		catch(Exception e) {
			System.out.println(e);
			System.out.println("\n This is the Arithmatic Exception");
		}
	}

}
