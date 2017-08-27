class Binary{
	public static void main(String[] args) {
		int ar[] = {5,19,28,35,57,98};

		System.out.println("Vlaue occuered at " + binary(ar,0,5,35));
		


	}

static int binary(int arr[],int low,int high,int x) {
	System.out.println("arr,low,high,x are as" + low + high + x);
	int mid;
	if(high>=low) {
		mid = (high + low)/2;
		if(arr[mid]==x)	return mid+1;
		else if(arr[mid]<x) return binary(arr,mid+1,high,x);
		else return binary(arr,low,mid-1,x);
	}
	return -1;


}

}
