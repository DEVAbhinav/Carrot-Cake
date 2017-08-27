// PROGRAMS IN sTRING
//CHECK FOR PALLINDROME STRING

//PARSE JSON STRING  {NAME : "ABHINAV",AGE: "18"}
import java.util.Scanner;

class pallindrome {
	public static void main (String arg[]) {
		String line;
		int i,j,flag=0;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the string");
		line = obj.nextLine();
		//System.out.println("line Entered is " +line);
		i=0;
		j=(line.length()-1);
		//System.out.println("value for i and j are " + i + j);
		while(i<=j) {
			if (line.charAt(i)!=line.charAt(j)){
				flag=1;
				break;			}
			i++;j--;
		}
		//System.out.println("Flag value is "+flag);
		if(flag == 1)
			System.out.print("Not pallindrome");
		else
			System.out.print("pallindrome String " + line );

	}
}