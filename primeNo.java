public class primeNo {
    public static void main(String[] args) {
        int i,j,n=20;
        
        for(i=1;i<=n;i++){
            if(i==1 || i==0){
                continue;
            }
            int flag=1;
            for(j=2;j<=i/2;j++){
              if(i%j==0){
                //System.out.print(i+" ");
                flag=0;
                break;
              }
            }
        
            if(flag==1){
            System.out.println(i+" ");
            }
        }
    }
}

