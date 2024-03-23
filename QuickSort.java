

public class QuickSort {
    public static int partion(int[] arr,int low, int high){
        int pivot = arr[high];
        int i = low-1;
        for(int j=low;j<high;j++){
            if(arr[j] < pivot){
                i++;
                //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
            i++;
            int temp = arr[i];
            arr[i] = pivot;
            arr[high] = temp;
            return i; //pivot index

        }


    public static void Sorts(int[] arr,int low, int high){
        if(low < high){
        int pidx = partion(arr,low,high);
        Sorts(arr,low,pidx-1);
        Sorts(arr,pidx+1,high);
    }
}
   public static void main(String[] args) {
   int[] arr = {5,4,6,8,7,3,2,1};
   int n = arr.length;
   Sorts(arr,0,n-1);
   for(int i=0;i<n;i++){
    System.out.print(arr[i]+" ");
   }
   } 
}

