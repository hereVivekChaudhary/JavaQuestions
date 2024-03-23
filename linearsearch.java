public class linearsearch{   
 public static void main(String[] args) {
    int[] arr = {2,4,6,1,3,8,7};
    int temp=8,c=0,i;
    
    for(i=0;i<arr.length;i++){
       if(arr[i] == temp){
        c++;
        break;
       }
    }
   if(c>=1){
    System.out.println("elements at index:"+i);
   }else{
    System.out.println("not found");
   }
    
}

} 
    

