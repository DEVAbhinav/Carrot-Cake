#include <iostream>
#include <string>


using namespace std;



int main()
{	int i= 0,T,arr[8];
	string seat[] = ["1LB","2MB","3UP","4LB","5MB","6UB","7SL","8SU"];
	/* code */
	scanf("%d",&T);
	//taking input of the data.
	
	while(i<T) {
		scanf("%d",&arr[i++]);
		i++;
	}


	for (i=0;i<T;i++) {
		value = arr[i];
		if (value<7) {
			arr[i] = (arr[i] + 2)%6;
		}

		arr[i] = ((arr[i])%2+6)
		i++;
	}
	for (i=0;i<T;i++)
		printf("%s",seat[i]);

	return 0;
}