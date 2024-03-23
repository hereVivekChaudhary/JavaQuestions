public class subarray {
    public static void main(String[] args) {
        int[]  arr={1,2,3,4,5,6};
        int csum =0,i,sum=12;
        int l=0;
        int r=0;
        while(csum < sum){
            if(csum <= sum){
                csum+=arr[r];
                r++;

            }
            else if(csum > sum){
                csum-=arr[l];
                if(csum==sum){
               System.out.println(l + " " +r);

                }
            }
        }
        

    }
    
}
