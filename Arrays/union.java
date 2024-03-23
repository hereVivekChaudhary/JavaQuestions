public class union {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        int[] b={4,5,6,7,8};
        
        int m=a.length;
        int n=b.length;
        int i=0,j=0;
        int[] c = new int[m+n];
        int k=0;
        while(i<m && j<n){
            if(a[i] < b[j]){
              i++;
          
            }
            else if(a[i] == b[j]){
                c[k++] = a[i++];
                j++;
            }
            else{
                j++;
            }
        }
           
        for( k=0;k<c.length;k++){
          System.out.print(c[k]+" ");
        }

    }
    
    }

