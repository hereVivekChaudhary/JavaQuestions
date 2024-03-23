import java.lang.Math;
public class Gcd {
    public static void main(String[] args) {
        int n1=34,n2=28;
        //int gcd=0;
        //int mn = Math.min(n1,n2);
        //for(int i=mn;i>=0;i--){
            //if(n1%i == 0 && n2%i ==0){
              //  gcd=i;
            //    break;
          //  }
        //}
        //System.out.println("gcd="+gcd);
        //int lcm=(n1*n2)/gcd;
       // System.out.println("lcm="+lcm);


       //2nd method (division)
       while (n1%n2 != 0){
        int rem = n1%n2;
        n1=n2;
        n2=rem;
       }
       System.out.println("gcd ="+n2);
       int lcm= (n1*n2)/n2;
       System.out.println("lcm="+lcm);
    }
    
}
