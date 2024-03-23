public class reverse {
      
    
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7,8,9};
        int n=arr.length;
        int i=0,j=n-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
            
        }
        for(int s=0;s<n;s++){
            System.out.print(arr[s]+" ");
        }
    }
}
        
   
