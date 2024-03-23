import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a=0,b=1,c;
        while(num != 0){
        c=a+b;
        System.out.print(c+" ");
        a=b;
        b=c;
        
        num--;
    }
}
}
