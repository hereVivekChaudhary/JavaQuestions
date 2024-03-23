public class peak {
    public static int pelement(int[] arr,int n){
        if(arr[0] > arr[1]){
            return 1;
        }
        else if(arr[n-1] > arr[n-2]){
            return 1;
        }
        
            for(int i=1;i<n-1;i++){
                if(arr[i] > arr[i-1] && arr[i] > arr[i+1]){
                    return 1;
                }
            }
            return 0;
        }
    
    public static void main(String[] args) {
        int[] arr={1,2,3};
        int n=arr.length;
        int num=pelement(arr,n);
        System.out.println(num);
        
    }
    
}
