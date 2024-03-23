import java.util.*;


public class query {
    public static int[] find(int[] arr){
        int n=arr.length;
        int[] freq=new int[100];
        for(int i=0;i<n;i++){
            freq[arr[i]]++ ;
            
        }
        return freq;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr={10,20,30,40,50,60,70,80};
        //int n=arr.length;
        int[] freq = find(arr);
        System.out.println("number of query:");
        int q =sc.nextInt();
        
        while(q > 0){
            System.out.println("elements to be searched:");
            int x=sc.nextInt();
            if(freq[x] > 0){
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }
            q--;
        }

    }

}
