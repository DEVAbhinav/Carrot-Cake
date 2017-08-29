


class ShellSort {
	public static void main(String[] args) {
		int arr [] = {56,74,867,34,22,87,990,17,99,76,57,876,65,54,};
		ShellSort ob = new ShellSort();
		ob.shellSort(arr);
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i]+",");
	}



	 void shellSort(int arr[]) {
		int n = arr.length;
		int i,j,k,temp;
		int gap []  = {5,4,3,1};

		for (i=0;i<gap.length;i++) {
			for(k = 0; k<gap[i]; k++)
			for (j=gap[i]+k;j<n ;j+=gap[i] ) {
				if(arr[j]<arr[j-gap[i]]) {
					temp = arr[j];
					arr[j] = arr[j-gap[i]];
					arr[j-gap[i]] = temp;
				}
			}
		}
		

	}
}