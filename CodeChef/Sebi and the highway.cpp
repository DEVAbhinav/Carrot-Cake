#include <iostream>


using namespace std;



int main()
{	
	/* code */
	cin>>T;
	
	//taking input of the data.
	
	while(i<T) {
		cin>>s[i]>>sg[i]>>fg[i]>>d[i]>>t[i];
		
	}


	for (i=0;i<T;i++) {
		otherCarSpeed[i] = calculateSpeed(s[i],sg[i],fg[i],d[i],t[i]);
	}
	

	for (i=0;i<T;i++)
	//looop for printing result	cout<<seat[arr[i]]<<endl;

	return 0;

}
