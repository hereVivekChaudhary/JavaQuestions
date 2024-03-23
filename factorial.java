import java.util.Scanner;
public class factorial{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("pls enter two numbers");
    int num = sc.nextInt();
    int num1=sc.nextInt();
    
    for(int i=num;i<=num1;i++){
        int f=1;
    for( int j=i;j>=1;j--){
        f = f*j;
    }
    System.out.println("factorial of number:"+i+" : "+f);



}

}
} 
    

