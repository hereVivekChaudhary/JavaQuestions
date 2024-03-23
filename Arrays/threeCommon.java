//import java.io.*;
class threeCommon {
    void find(int[] a1, int[] a2, int[] a3){
        int i=0,j=0,k=0;
        while(i<a1.length && j<a2.length && k<a3.length){
            if(a1[i] == a2[j] && a2[j] == a3[k]){
                System.out.print(a1[i]+" ");
                i++;
                j++;
                k++;

            }
            else if(a1[i] < a2[j])
             i++;
            
            else if(a2[j] > a3[k])
                j++;
            
            else
                k++;
            
        }
    }
    
    
    public static void main(String[] args) {
        threeCommon ob = new threeCommon();
        int[] a1 = {1,2,3,4};
        int[] a2 = {2,3,4,5};
        int[] a3 = {3,4,5,6};
        System.out.println("three common elements:");
        ob.find(a1,a2,a3);
    }    
}
