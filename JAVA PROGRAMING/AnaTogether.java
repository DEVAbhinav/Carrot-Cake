import java.util.Scanner;
import java.lang.*;
 

 public class  AnaTogether {


 	public static void main(String[] args) {
		String line, line2;
		//int k;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the string ");
		line = obj.nextLine();	
		String names[] = line.split(" ");
		//System.out.print(names[1]);
		AnaTogether ob = new AnaTogether();
		for (int i= 0;i<names.length;i++)
			names[i] = (ob.sort((names[i].toCharArray()),0,names[i].length()-1));
		System.out.println("values sorted are " + String.valueOf(names));

	}

	String sort(char str[],int low, int high) { 
		int p;
		if(low<high) { 
			p = partition(str,low,high);
			sort(str,low,p-1);
			sort(str,p+1,high);

		}
		return String.valueOf(str);

	}

	int partition (char str[], int low,int high) { 
		int i=low-1;int j;
		char temp;
		char pivot = str[high];

		for( j=low;j<high;j++) { 
			if (str[j]<pivot) {
				temp = str[++i];
				str[i] = str[j];
				str[j] = temp;
			}
		}
		str[j ] = str[++i];
		str[i] = pivot;

		return i;
	}


}

