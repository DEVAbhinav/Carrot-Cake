// Java program to find k'th non-repeating character
// in a string
import java.util.Scanner;
 
import java.util.Arrays;
import java.util.Arrays;
 

class NonRepeating {

	public static void main(String[] args) {
		String line;
		int k;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the string & k value");
		line = obj.nextLine();	
		k = obj.nextInt();
		NonRepeating obj2  = new NonRepeating();
		obj2.nonRepeating(line,k);	
		
	}

	private  void nonRepeating (String str,int k) {
		int character[] = new int[256];
		int index[] = new int[256];
		int i,j,temp,l=str.length();
		for(i=0;i<256;i++)
			index[i]=l;


		for(i=0;i<l;i++) {
			character[str.charAt(i)]++;
			if(character[str.charAt(i)] == 1)
				index[str.charAt(i)]=i;
			else if(character[str.charAt(i)] >1)
				index[str.charAt(i)] = l;
		}

		Arrays.sort(index);

		// for(i=0;i<l-1;i++) {
		// 	for(j=i+1;j<l;j++) {
		// 		if(index[i]>index[j]){
		// 			temp = index[i];
		// 			index[i] = index[j];
		// 			index[j] = temp;
		// 		}

		// 	}
		// }
		//for (i=0;i<256;i++)
		//	System.out.println(index[i]);

		// }
		//System.out.println("value of index is " + index[0] + index[k]+ index[255]);
		System.out.println( (index[k-1] != l)? "value is " +str.charAt(index[k-1]):-1);

		

	}

}