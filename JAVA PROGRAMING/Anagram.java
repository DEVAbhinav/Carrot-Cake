
import java.util.Scanner;
import java.lang.*;
 

 public class  Anagram {


 	public static void main(String[] args) {
		String line1, line2;
		int k;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the string & k value");
		line1 = obj.nextLine();	
		line2 = obj.nextLine();	
		char [] chr1 = line1.toCharArray();
		char [] chr2 = line2.toCharArray();
		Anagram ob = new Anagram();
		ob.quick(chr1,0,chr1.length-1);
		ob.quick(chr2,0,chr2.length-1);
		ob.match(chr1,chr2);
	}

	void match(char arr1[],char arr2[]) {
		if (arr1.length != arr2.length) {
			System.out.print("not Anagram!");
			return;
		}

		for(int j=0; j<arr1.length;j++)
			if(arr1[j] != arr2[j]) {
				System.out.println("Not anagram!!");
				return;
			}

		System.out.println("Perfect Anagram!!");

	}


	void quick (char str[], int si, int fi) {
		int pi;

		if(si<fi) {
			pi = partition(str,si,fi) ;
			quick(str,si,pi-1);
			quick(str,pi+1,fi);
		}
	}

	int partition(char str[],int low, int high) { 
		int i = low-1;
		int j = low; char temp;
		char pivot = str[high];

		for(j=low;j<high;j++) {
			if(pivot>str[j]){
				i++;
				temp = str[i];
				str[i] = str[j];
				str[j] = temp;
			}
		}
		str[j] = str[++i];
		str[i] = pivot;

		return i;



	}

 }
