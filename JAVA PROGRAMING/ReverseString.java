
import java.util.Scanner;
import java.lang.*;

class ReverseString {
	
	static String rev;
	public static void main (String a[]) {
		//body 
		int indexOfSpace;
		String line, abbr;
		//System.out.println("-->"+ indexOfSpace);
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a String");
		line = obj.nextLine();

		ReverseString obj1 = new ReverseString();
		obj1.reverse(line);
		//System.out.println(" " +rev);
	}

	private void reverse(String str) {
		//System.out.print("Called reverse");
		//System.out.print("str.length is " + str.length());
		if(str == null||str.length()==0){
			//System.out.print("tRUE IN IF");
			return;
		}
		System.out.print(str.charAt(str.length()-1));
		//rev += str.charAt(str.length()-1);
		reverse(str.substring(0,str.length()-1));
	}
}