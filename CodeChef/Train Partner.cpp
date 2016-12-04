#include <iostream>


using namespace std;



int main()
{	int i= 0,T,arr[8],value;
	char seat[8][4] = {"1LB","2MB","3UB","4LB","5MB","6UB","7SL","8SU"};
	/* code */
	cin>>T;
	//taking input of the data.
	
	while(i<T) {
		cin>> arr[i++];
		
	}


	for (i=0;i<T;i++) {
		value = arr[i];


		if (value<7) {
			arr[i] = (arr[i] + 2)%6;
		}	
		else {
		arr[i] = ((arr[i])%2+6);
		
		}
	}
	for (i=0;i<T;i++)
		cout<<seat[arr[i]]<<endl;

	return 0;
}
