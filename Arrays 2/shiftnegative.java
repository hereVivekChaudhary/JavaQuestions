public class shiftnegative {
    public static void main(String[] args) {
        int[] arr= {-4,-6,-2,-4,-7,-1,-5};
        int n=arr.length;
        int[] ans = new int[n];
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i] >=0){
            ans[j++] = arr[i];
            }
        }
        if (j==n || j==0){
            return;
        }
        for(int i=0;i<n;i++){
            if(arr[i] < 0){
                ans[j++] = arr[i];
            }
        }
        // int i=0;
        // for( j=0;j<n;j++){
        //     arr[i++] =ans[j++];

        // }
         for(j=0;j<n;j++){
            System.out.print(ans[j]+" ");
         }
    }
}
