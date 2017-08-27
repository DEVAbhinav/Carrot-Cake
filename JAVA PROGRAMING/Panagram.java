
import java.util.Scanner;
import java.lang.*;

class Panagram {
	
	//static String rev;
	public static void main (String a[]) {
		//body 
		int indexOfSpace;
		String line, abbr;

		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a String");
		line = obj.nextLine();

		Panagram obj1 = new Panagram();
		obj1.checkPanagram(line);
		//System.out.println(" " +rev);
	}

	protected void checkPanagram(String str) {
		int arr[] = new int[26];
		int i;
		char character;
		str=str.toLowerCase();
		for(i=0;i<str.length();i++) {
			character = str.charAt(i);
			if(character>96&&character<123)
				arr[character-97]++;
			}
		for (i=0;i<25;i++)
			if(arr[i]==0) {
				System.out.println("Not panagram!!");
				return;
			}
		System.out.println("Panagram!!");

	}
}