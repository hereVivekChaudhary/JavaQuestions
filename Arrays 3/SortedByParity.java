
    public class SortedByParity {
        public static void Swap(int [] arr,int i,int j) {
            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
        }
        public static void printArray(int [] arr) {
            int n=arr.length;
            for(int i=0;i<n;i++) {
                System.out.print(arr[i]+" ");
            }
        }
        public static void Sorted(int[] arr) {
            int n= arr.length;
            int left=0;
            int right=n-1;
            while(left<right) {
                if(arr[left] % 2 == 1 && arr[right] % 2 == 0) {
                    //int temp=arr[left];
                    //arr[left]=arr[right];
                    //arr[right]=temp;
                    Swap(arr,left,right);
                    left++;
                    right--;
                }
                if(arr[left] % 2==0) {
                    left++;
                }
                if(arr[right] % 2 ==1) {
                    right--;
                }
            }
            
            
        }
        
    
        public static void main(String[] args) {
            // TODO Auto-generated method stub
           int[] arr = {2,4,5,6,0,8,9,1};
           Sorted(arr);
           printArray(arr);
        }
    
    }
}
