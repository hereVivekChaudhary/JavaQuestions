public class Sort01Array {
	public static void printArray(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			System.out.print(arr[i] +" ");
		}
	}
	public static  void sortArray(int[] arr ) {
		int n= arr.length;
		int left=0;
		int right = n-1;
		while(left < right) {
			if(arr[left] == 1 && arr[right] == 0) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
			}
			if(arr[left]  == 0) {
			left++;
			}
			if(arr[right] == 1) {
				right--;
			}
			
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int[] arr = {1,0,0,1,1,1,0,0,1,1};
     sortArray(arr);
     printArray(arr);
     
    
	}

}