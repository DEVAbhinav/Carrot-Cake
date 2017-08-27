//REMOVE SPACESv and change Abhinav  krumar pandey to A.K.Pandey

import java.util.Scanner;
import java.lang.*;

class Removespaces {
	

	public static void main (String a[]) {
		//body 
		int indexOfSpace;
		String line, abbr;

		Scanner obj = new Scanner(System.in);
		System.out.println("Enter full name");
		//Mr.Abhinav Kumar Pandey
		line = obj.nextLine();
		indexOfSpace = line.indexOf(' ');
		if (indexOfSpace ==-1) {
			System.out.println("Invalid name dude");
			return;
		}
		abbr = line.substring(0,indexOfSpace) + " ";
		//System.out.println("abbr at current stage is " + abbr);	
		//System.out.println("index of a in xyz is" + "xyz".indexOf('a'));

		while(indexOfSpace<line.lastIndexOf(' ')) {
			abbr = abbr + Character.toUpperCase(line.charAt(indexOfSpace+1))+".";
			indexOfSpace = line.indexOf(" ",(indexOfSpace+1));
		}
		abbr += line.substring(indexOfSpace+1);

		System.out.println("abbreviated name is " + abbr); 
	}
}