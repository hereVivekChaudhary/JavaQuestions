import java.util.*;
public class romantoInteger {
    public static int value(char str){
      if(str == 'I')return 1;
      if(str ==  'V') return 5;
      if(str == 'X') return 10;
      if(str == 'L') return 50;
      if(str == 'C') return 100;
      if(str == 'D') return 500;
      if(str == 'M') return 1000;
      return -1;

    }

    public static int Roman(String str){
        int res = 0;
        for(int i=0;i<str.length();i++){
        int s1 = value(str.charAt(i));
        if(i+1 < str.length()){
        int s2 = value(str.charAt(i+1));
        
        
            if(s1 >= s2){
            res = res + s1;
            }
            else{
            res = res + (s2-s1);
            i++;
            }
        }
        else{
            res = res + s1;
        }
    }


        return res;

    }

    public static void main(String[] args) {
        String str = "XL";
        int num = Roman(str);
        System.out.println("roman to integer:"+num);
    }
    
}
