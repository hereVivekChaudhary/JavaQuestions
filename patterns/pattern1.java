package patterns;

public class pattern1 {
    
        public static void main(String[] args) {
            pattern14(5);
        }
        static void pattern(int n){
            for(int i=1;i<=n;i++){
               for(int j=i;j<=n;j++){
                 System.out.print("*"+" ");
               }
               System.out.println();
            }
        }
        static void pattern2(int n){
        for(int i=1;i<=n;i++){
            for(int s=1;s<=n-i;s++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }  
     static void pattern3(int n){
        for(int i=1;i<=n;i++){
            for(int s=1;s<=i-1;s++){
                System.out.print(" ");
            }
            for(int j=i;j<=n;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        
    }
    static void pattern4(int n){
        for(int i=1;i<=n;i++){
            for(int s=1;s<=n-i;s++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        for(int i=1;i<n;i++){
            for(int s=1;s<=i-1;s++){
                System.out.print(" ");
            }
            for(int j=i;j<n;j++){
                System.out.print(" "+"*");
            }
            System.out.println();
        }
        
    }
    // Pattern 4 and 5 both are same
    
    public static void pattern5(int n){
        for(int r=1;r<=2*n;r++){
            int totalcolumn = r > n? 2*n-r : r;

            int space = n - totalcolumn;
            for(int s=1;s<=space;s++){
                System.out.print(" ");
            }
            for(int j =1;j<=totalcolumn;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
     public static void pattern6(int n){
        for(int r=1;r<2*n;r++){
            int totalco = r>n ? 2*n-r : r;
            //space
            for(int s =1;s<= n-totalco;s++){
                System.out.print(" ");
            }

            for(int c=1;c<=totalco;c++){
                System.out.print("*");
            }
            System.out.println();
        }
     }
     public static void pattern7(int n){
        for(int r=1;r<=n;r++){
            for(int c=1;c<=n;c++){
                if(r==1 || c==1 || r==n || c==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                //System.out.println();
            }
            System.out.println();
        }
     }

       
     static void pattern8(int n){
        for(int i=1;i<=n;i++){
            for(int s=1;s<=i-1;s++){
                System.out.print(" ");
            }
            for(int j=i;j<=n;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        
    }
    static void pattern9(int n){
        for(int r=1;r<=n;r++){
            for(int c=1;c<=r;c++){
                System.out.print("*");
            }
            int sp=2*(n-r);
            for(int s=1;s<=sp;s++){
                System.out.print(" ");
            }
            for(int c=1;c<=r;c++){
                System.out.print("*");
            }
        
            System.out.println();
        }
        
        for(int r=n;r>=1;r--){
            for(int c=1;c<=r;c++){
                System.out.print("*");
            }
            int sp=2*(n-r);
            for(int s=1;s<=sp;s++){
                System.out.print(" ");
            }
            for(int c=1;c<=r;c++){
                System.out.print("*");
            }
            System.out.println();
    }
    }

    public static void pattern10(int n){
        for(int r=1;r<=n;r++){
            for(int s=1;s<=n-r;s++){
                System.out.print(" ");
            }
            for(int c=r;c>=1;c--){
                
                System.out.print(c);
            }
            for(int c=2;c<=r;c++){
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public static void pattern11(int n){
        int k=0;
        for(int r=1;r<n;r++){
            //spaces
            for(int s=1;s<=n-r;s++){
                System.out.print(" ");
            }
            while(k != (2*r-1)){
                if(k==0 || k== 2*r-2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                k++;
            }
              k=0;
              System.out.println();
        }
        for(int r=1;r<=2*n-1;r++){
            System.out.print("*");

        }
    }
    public static void pattern12(int n){
        for(int r=1;r<=n;r++){
            for(int s=r;s<n;s++){
                System.out.print(" ");
            }
            for(int c=1;c<r;c++){
                if(c==1 || r==n){
              System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            for(int c=1;c<=r;c++){
                if(r==n ||  c==r){ 
                System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        
        }
}
    public static void pattern13(int n){
        for(int r=1;r<=n;r++){
            for(int s=1;s<=r-1;s++){
                System.out.print(" ");
            }
            for(int c=1;c<=n-r;c++){
                if(c==1 || r==1){
                System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            for(int c=1;c<=n-r+1;c++){
                if(r==1 || c==n-r+1){
                System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

}
public static void pattern14(int n){
    for(int r=1;r<=n;r++){
        for(int c=1;c<=r;c++){
            if(c==1 || c==r){
            System.out.print("*");
            }
            System.out.print(" ");
        }
        int sp=2*(n-r);
        for(int s=1;s<=sp;s++){
            System.out.print(" ");
        }
        for(int c=1;c<=r;c++){
            if(c==1 || c==r){
            System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
       System.out.println();
    }
    for(int r=1;r<=n;r++){
        for(int c=1;c<=n-r+1;c++){
            if(c==1 || c==n-r+1){
            System.out.print("*");
            }
            else{
                System.out.print(" ");
            }

        }
        int sp=2*r-2;
        for(int s=1;s<=sp;s++){
            System.out.print(" ");
        }
        for(int c=1;c<=n-r+1;c++){
            if(c==1 || c==n-r+1){
            System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
}
    
        
     


    

