public class alternate {
    public static int[] alter(int[] arr,int n){
        int c=0,i;
        for( i=0;i<n;i++){
          if(arr[i] >= 0){
            c++;
          }
        }
          int[] a=new int[c];
          int x=0;
          int[] b=new int[n-c];
          int y=0;
          int[] r=new int[n];
          int t=0;
          for(i=0;i<n;i++){
            if(arr[i] >=0){
                a[x++] = arr[i];
            }
            else{
                b[y++] = arr[i];
            }
          }
         
          while(x<c && y<n-c){
            r[t++] = a[x++];
            r[t++] = b[y++];
          }
          while(x<c){
            r[t++] = a[x++];
          }
          while(y<n-c){
            r[t++] = b[y++];
          }
          return r;

        }

    

    public static void main(String[] args) {
        int[] arr = {1,2,4,-2,-4,5,7,7,-8};
        int n=arr.length;
        int[] r=alter(arr,n);
        for(int t=0;t<n;t++){
         System.out.print(r[t]+" ");
        }
        
    }
}




