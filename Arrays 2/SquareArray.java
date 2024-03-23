
    public class SquareArray {
        public static void printArray(int[] arr ) {
            int n=arr.length;
            for(int i=0;i<n;i++) {
                System.out.print(arr[i]+" ");
            }
        }
        public static int[] SortSquare(int[] arr) {
            int n=arr.length;
            int left=0;
            int right=n-1;
            int[] arr1 = new int[n];
            int x=n-1;
            while(left <= right) {
                if(Math.abs(arr[left]) > Math.abs(arr[right])){
                arr1[x--] = arr[left] * arr[left];
                left++;
                }
                else {
                  arr1[x--] = arr[right] * arr[right];
                  right--;
                }
                
            }
            return arr1;
        }
    
        public static void main(String[] args) {
            // TODO Auto-generated method stub
         int[] arr= {-10,-5,2,4,5,7};
         int[] arr1=SortSquare(arr);
         printArray(arr1);
       
     
        }
        }
}
