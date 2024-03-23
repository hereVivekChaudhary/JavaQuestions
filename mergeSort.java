public class mergeSort{
    public static void conquer(int[] arr,int si,int mid,int ei){
        int[] merge = new int[ei - si +1];
        int id1 = si;
        int id2 = mid+1;
        int x=0;
        while(id1 <= mid && id2 <= ei){
            if(arr[id1] <= arr[id2]){
                merge[x++] = arr[id1++];
            }
            else{
                merge[x++] = arr[id2++];
            }
        }
        while(id1 <= mid){
            merge[x++] = arr[id1++];
        }
       while(id2 <= ei){
        merge[x++] = arr[id2++];
       }
       for(int i=0, j=si;i<merge.length;i++,j++){
        arr[j] = merge[i];
       }
       
    }
    public static void divide(int[] arr,int si,int ei){
        if(si >= ei){
            return;
        }
        int mid = si + (ei-si) /2;
        divide(arr,si,mid);
        divide(arr,mid+1,ei);
        conquer(arr,si,mid,ei);
    }
        public static void main(String[] args) {
        int[] arr = {4,6,5,2,1,3};
        int n = arr.length;
        divide(arr,0,n-1);
        for(int i =0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
    

