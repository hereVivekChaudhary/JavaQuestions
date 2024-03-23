public class countsum {
    public static void main(String[] args) {
        int[] arr = {1,2,1,1,2,1};
        int c=0,sum=3;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] + arr[j] == sum){
                    c++;
                }
            }
        }
        System.out.println("no of count="+c);
    }
    
}
