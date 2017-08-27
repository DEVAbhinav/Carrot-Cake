//Find k’th character of decrypted string;
import java.util.Scanner;
import java.lang.*;

class Dekrypt {


	public static void main(String[] args) {

		Scanner o = new Scanner(System.in);
		int frequency=0;
		String substr;
		String str = o.nextLine();
		int k = o.nextInt();
		int index = 0,count=0;
		System.out.println("checkp[opint 1");


		while(index<str.length()) { 
			//System.out.println(str.charAt(index));
			substr="";
			frequency = 0;

			while(index<str.length() && str.charAt(index)>='a'&& str.charAt(index)<='z' ){
				System.out.println("checkpoint entry in substring loop");
				substr = substr + str.charAt(index);
				index++;
			}


			while( index<str.length() && str.charAt(index)>='0'&&str.charAt(index)<='9') {
				
				frequency = frequency*10+ (str.charAt(index)-'0');
				index++;
			}
			System.out.println("checkpoint value of frequency after frequency loop"+ frequency);

			if(count  + frequency*substr.length()<k)
				count = count  + frequency*substr.length();

			else if (count  + frequency*substr.length()>=k) {
				System.out.println("valus k count substr " + k + count+ substr);
				System.out.println(substr.charAt(((k-count)%substr.length())==0?substr.length()-1:k%substr.length()-1));
				return;
			}


		}

	}
}