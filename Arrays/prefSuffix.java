
    import java.util.Scanner;


   public class prefSuffix{

	public static int totalSum(int[] arr) {
		int tSum =0;
		for(int i=0;i<arr.length;i++) {
			tSum += arr[i];
		}
		return tSum;
	}
public static boolean equalSum(int[] arr) {
    int tSum= totalSum(arr);
	
	int n=arr.length;
	
	int prefSum = 0;
	for(int i = 1;i<n;i++) {
		prefSum += arr[i];
		int suffixSum = tSum - prefSum;
		if(prefSum == suffixSum) {
			return true;
			
		}
		
	}
	return false;
}
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
	     boolean b = equalSum(arr);
	     System.out.println(b);
	}

}
}
