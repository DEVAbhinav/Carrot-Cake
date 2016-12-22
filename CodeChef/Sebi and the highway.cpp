#include <iostream>
#include <cmath>

using namespace std;



int correctGuess (int s,int sg,int fg,int d, int t);

int main()
{	int T;
	/* code */
	cin>>T;
	int s[T],sg[T],fg[T],d[T],t[T],i,Answer[T];
	
	//taking input of the data.
	char outputChoice[3][] = { "SEBI","FATHER","DRAW"};
	
	while(i<T) {
		cin>>s[i]>>sg[i]>>fg[i]>>d[i]>>t[i];
		i++;
		
	}


	for (i=0;i<T;i++) {
		Answer[i] = correctGuess(s[i],sg[i],fg[i],d[i],t[i]);
	}
	

	for (i=0;i<T;i++)
	//looop for printing result
		cout<<outputChoice[Answer[i]]<<endl;

	return 0;

}


int correctGuess (int s,int sg,int fg,int d, int t) {
	
	//calculating actual Speed.
	float actualSpeed = s+(float)d*50/t;
	
	if(abs((actualSpeed-sg) > abs(actualSpeed-fg)))
		return 1;
	else if(abs((actualSpeed-sg) < abs(actualSpeed-fg)))
		return 0;
	else return 2;

}