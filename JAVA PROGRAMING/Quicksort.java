

import java.util.Scanner;
import java.lang.*;

class Quicksort {
	
	//static String rev;
	public static void main (String a[]) {
		//body 
		int indexOfSpace;
		String line, abbr;
		//System.out.println("-->"+ indexOfSpace);
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a String");
		line = obj.nextLine();
		char [] chr  = line.toCharArray();

		Quicksort obj1 = new Quicksort();
		obj1.quick(chr,0,chr.length-1);

		System.out.println("sorted array");
        obj1.printArray(chr);

	}

	void printArray(char arr[]) {
		for(int i = 0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
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