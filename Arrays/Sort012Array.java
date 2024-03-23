
    
public class Sort012Array {
	public static void Sorted(int[] arr,int n) {
		//int n=arr.length;
		int i,c0=0,c1=0,c2=0;
		for( i=0;i<n;i++) {
		switch(arr[i]) {
		case '0':{ c0++;
		break;}
		case '1':{ c1++;
		break;}
		case '2':{ c2++;
		break;}
		
		}
		}
	
	
		//int[] ans = new int[n];
		//int x=0;
	    i=0;
		while(c0 >0) {
			arr[i++] = 0;	
			c0--;
		}
		while(c1>0) {
			arr[i++] = 1;
			c1--;
		}
		while(c2>0) {
			arr[i++] = 2;
			c2--;
		}
		printArray(arr);
		}
	

	public static void printArray(int[] arr) {
		int n=arr.length;
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr = {0,1,1,2,1,1,0,0,2};
        int n=arr.length;
        Sorted(arr, n);
       // printArray(arr);
	}

}

