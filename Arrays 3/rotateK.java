public class rotateK {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8};
        int k=10;
        int n=arr.length;
        for(int i=0;i<k;i++){
            int temp=arr[n-1];
            for(int j=n-2;j>=0;j--){
                arr[j+1]=arr[j];
            }
            arr[0]=temp;
        }
        for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
        }

    }
    
}
