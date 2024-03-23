
    public class mergetwoArray {

        public static void main(String[] args) {
            // TODO Auto-generated method stub
        int [] arr1 = {1,2,3,4,5};
        int [] arr2 = {2,5,6,7,8,9};
        int l= arr1.length+arr2.length;
        int [] reslt = new int[l];
        int x=0,i=0,j=0;
        while(i<arr1.length && j<arr2.length) {
            if(arr1[i] < arr2[j]) {
                reslt[x++] = arr1[i++];
            
            }
            else {
                reslt[x++] = arr2[j++];
                
            }
        }
        
        while( i<arr1.length) {
            reslt[x++] = arr1[i++];
        
        }
        while(j<arr2.length) {
            reslt[x++] = arr2[j++];
       
        }
        for( x=0;x<l;x++) {
            System.out.print(reslt[x]+" ");
        }
        }
    
    }

