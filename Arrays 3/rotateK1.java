public class rotateK1 {
//     public static int[] rotate(int[] arr,int s, int k){
//         int n=arr.length;
//         k=k%n;
//         int[] ans=new int[n];
//         int j=0;
//         for(int i=n-k;i<=n-1;i++){
//            ans[j++] = arr[i];
//         }
//         for(int i=0;i<=n-k-1;i++){
//             ans[j++] = arr[i];
//         }
//         return ans;
//     }
//  public static void main(String[] args) {
//     int[] arr={1,2,3,4,5,6,7,8};
//     int k=5;
//     int[] ans=rotate(arr,0,k);
//     for(int i=0;i<arr.length;i++){
//        System.out.print(ans[i]+" ");
//     }
//  }    
// }

//optimal solution with respect to space complexity

public static void Reverse1(int[] arr,int s,int e){
    //int n=arr.length;
    while(s<e){
        int temp=arr[s];
        arr[s]=arr[e];
        arr[e]=temp;
        s++;
        e--;
    }
}
public static void main(String[] args) {
    int[] arr ={1,2,3,4,5,6,7,8,9};
    int n=arr.length;
    int k=5;
    Reverse1(arr,0,n-k-1);
    Reverse1(arr,n-k,n-1);
    Reverse1(arr,0,n-1);
    for(int i=0;i<arr.length;i++){
    System.out.print(arr[i]+" ");
    }
}

}