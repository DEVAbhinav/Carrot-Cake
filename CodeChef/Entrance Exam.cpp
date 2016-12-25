#include <iostream>

using namespace std;



//is a c++ program for codechef External Exam problem.
//Run this in codechef g++ 14.something compiler.


long int minMarksNeeded (/*long int , long int */);

int main() {
	int T,i,j,k; //test case

	int totalApplicants,totalApplicantsSelected,numberOfExams,maxMarks;
	int marks;

	while(i<T) {
		i++;
		cin>>totalApplicants>>applicantsSelected>>numberOfExams>>maxMarks;
		int totalMarks[totalApplicants];
		
		for(j=0; j<totalApplicants-1; j++) {	//because last would be e-1 marks of Sergey. 
			for(k=0; k<numberOfExams; k++) {
				cin>>marks;
				totalMarks[j]+=marks;
			}
		}
		for(k=0; k<numberOfExams-1; k++) {
				cin>>marks;
				totalMarks[j]+=marks;
			}

		minMarksNeeded =	minMarksNeeded ( totalMarks[], totalApplicantsSelected,0, totalApplicants);

	}
}

//similat to kth largest element in 	http://www.geeksforgeeks.org/kth-smallestlargest-element-unsorted-array/
long int minMarksNeeded ( int totalMarks[], int k,int l,int r) {

	if (k>=l&&k<=r) { 

		pos = partition(totalMarks[],l,r);
		if(k-1<pos-l)
			minMarksNeeded(totalMarks, k,l, pos-1);
		if(k>pos-l)
			minMarksNeeded(totalMarks, k-pos+l+1,pos+1,r);
		else
			return totalMarks[pos];
	}

}
