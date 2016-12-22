#include <iostream>

using namespace std;



//fctrl is a recursive function for calculating number of zeroz in factorial.
//int fctrl (long int numberToBeFactorial, int powerOf5)

long int fctrl (long int , long int );

int main() {
	int t;
	//input number of test Case.
	cin>>t;
	int i=0; 
	long int inputArr[t+1],result[t+1]; 
	
	//taking input
	while(i<t) {
		cin>>inputArr[i++];	
	}

	//calling factorial for each iput
	for (i=0;i<t;i++) {
		result[i] = fctrl(inputArr[i],5);
	}

	//printing result
	for (i=0;i<t;i++)
		cout<<result[i]<<endl;
	return 0;
}


long int fctrl(long int n, long int k) {

	if (n<k)
		return 0;
	return (n/k) + fctrl(n,k*5);
} 