import java.util.*;
public class subset {
    public static String issub(int a[],int b[], int m,int n){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int x:a){
            if(map.containsKey(x)){
                map.put(x,map.get(x)+1);

            }
            else{
                map.put(x,1);
            }
        }
        for(int x:b){
            if(map.containsKey(x)){
                if(map.get(x)== 1){
                    map.remove(x);
                }
               else{
                map.put(x,map.get(x) - 1);
               }


            }
            else{
                return "No";
            }
        }
        return "true";
    }
    public static void main(String[] args) {
        int a[] = {11,22,33,44,55};
        int b[] = {11,22,44};
        int m= a.length;
        int n= b.length;
        String st=issub(a,b,m,n);
        System.out.println(st);
    }
    
}
