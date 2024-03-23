
    import java.util.Scanner;

public class PrefixSum {
    public static void printArray(int[] arr1) {
    	int n= arr1.length;
    	
    	for(int i =0;i<n;i++) {
    		
    		System.out.print(arr1[i]+" ");
    	}
    	
    }
    
    public static int[] prefSum(int[] arr) {
    	int n=arr.length;
       // int[] pref=new int[n];
       // pref[0]=arr[0];
    
    	for(int i=1;i<n;i++) {
    	arr[i] = arr[i-1] + arr[i];
    	}
      return arr;
    		  
    }
    //public static int TotalSum(int arr1) {
    	//int sum=0;
    //	for (int i=0;i<arr1.length;i++) {
    		//sum+=arr1[i];
    	//}
    //	return sum;
   // }
    
    
    public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     System.out.println("enter size");
     int n = sc.nextInt();
     int[] arr = new int[n+1];
     System.out.println("elements are:");
     for(int i=1;i<=n;i++) {
    	 arr[i] = sc.nextInt();
     }
     //System.out.println("original array");
     //printArray(arr);
     
     int[] arr1 = prefSum(arr);
     //System.out.println("resultant array:");
     //printArray(arr1);
     System.out.println("enter no. of query:");
     int q = sc.nextInt();
     
     while(q-- > 0) {
    	 System.out.println("Enter range:");
    	int l = sc.nextInt();
    	 int r = sc.nextInt();
    	 int ans = arr1[r] - arr1[l-1];
    	System.out.println("sum:"+ans);
    	 
    	
     }
     
     
     
    
	}

}
}
