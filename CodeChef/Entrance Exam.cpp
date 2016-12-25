#include <iostream>

using namespace std;



//fctrl is a recursive function for calculating number of zeroz in factorial.
//int fctrl (long int numberToBeFactorial, int powerOf5)

long int minMarksNeeded (/*long int , long int */);

int main() {
	int t;
	//input number of test Case.
	cin>>t;
	int i=0; 
	long int inputArr[4],result[t+1]; 
	
	//taking input
	for(inputArr[4] = {0};i<t;) {
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
