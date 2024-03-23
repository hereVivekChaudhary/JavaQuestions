public class BinarySearch{
    public static void main(String args[]){
    int[] arr = {2,4,6,8,10,13,15,17};
    int n=arr.length;
    int mid=0,si =0,end=n-1;
    int num=17,c=0;
    while(si <= end){
        mid = si + (end-si)/2;
        if(arr[mid] == num){
           c++;
           break;
        }
        else if(arr[mid] > num){
            end = mid-1;

        }
        else{
            si = mid+1;
        }

    }
    if(c>0){
        System.out.println(num+"found at index"+mid);
    } 
    else{
        System.out.println(num+"not found");
    }   
    }
}


