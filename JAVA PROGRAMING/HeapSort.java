class HeapSort {
	public static void main(String[] args) {
		HeapSort ob = new HeapSort();
		int arr[] = {13,45,67,34,90,44,78,54,67,98};
		int n = arr.length;
		ob.heapSort(arr);
		//printf(" just demo of printf in Java\n");
		for(int i=0;i<n; i++)
			System.out.print(arr[i] + ",");

	}

	void heapify(int arr[], int n, int i) {
		//int n = arr.length;
		int l = i*2+1;
		int r = i*2+2;
		int largest = i;
		int temp;

		if(l<n && arr[l]>arr[i])
			largest = l;
		if(r<n && arr[r]>arr[largest])
			largest = r;

		if(largest != i ) {
			temp = arr[largest];
			arr[largest] = arr[i];
			arr[i] = temp;
			heapify(arr,n,largest);
		}
	}

	void heapSort(int arr[]) { 
		int n = arr.length;
		int temp;
		for (int i = n/2-1;i>=0;i--) 
			heapify(arr,n,i);

		for (int i = n-1; i>=0; i--) {
			temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			heapify(arr,i, 0);
		}

		
	}
}