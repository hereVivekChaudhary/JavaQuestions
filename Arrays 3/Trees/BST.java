package Trees;
import java.util.*;
public class BST {
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data = data;
        }
    }
    public static Node insert(Node root,int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(root.data > val){
          root.left = insert(root.left,val);
        }
        else{
            root.right = insert(root.right,val);
          
        }
    
      return root;
    
    }
    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    //searching O(H)
    public static boolean search(Node root,int key){
        if(root == null){
            return false;
        }
        if(root.data > key){
            return search(root.left,key);
        }
        else if(root.data == key){
            return true;

        }
        else{
            return search(root.right ,key);
        }
    
    }
    //deletion of a node
    public static Node delete(Node root, int val){
        if(root.data > val){
            root.left = delete(root.left,val);
        }
        else if(root.data < val){
            root.right = delete(root.right,val);
        }
        else {// root.data == val
            // case=1
            if(root.left == null && root.right == null){
                return null;
            }
            //case=2
            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }
            //case=3
            else{
            Node insc = inordersuccessor(root.right);
            root.data = insc.data;
            root.right = delete(root.right , insc.data);
        }
    }
        return root;
    }
    public static Node inordersuccessor(Node root){
      while(root.left != null){
        root = root.left;
      }
      return root;
    }
    // questions: print in range
    public static void printinrange(Node root,int x,int y){
        if(root == null){
            return;
        }
        if(root.data >= x && root.data <= y){
            printinrange(root.left,x,y);
            System.out.print(root.data+" ");
            printinrange(root.right,x,y);
        }
        else if(root.data >= y){
            printinrange(root.left,x,y);
        }
        else{
            printinrange(root.right,x,y);
        }
    }
    //printpath
    public static void printpath(ArrayList<Integer> path){
        for(int i=0;i<path.size()-1;i++){
            System.out.print(path.get(i)+"-->");
        }
        System.out.println();
        
    }
    public static void printroot2leaf(Node root,ArrayList<Integer> path){
        if(root == null){
            return ;
        }
        path.add(root.data);
        //leaf
        if(root.left == null && root.right == null){
            printpath(path);

        }
        else{ // non-leaf
            printroot2leaf(root.left,path);
            printroot2leaf(root.right,path);
        }
        path.remove(path.size()-1);
    }
    
    public static void main(String[] args) {
        int[] values = {5,1,3,4,2,6,7};
        Node root = null;
        for(int i=0;i<values.length;i++){
            root = insert(root,values[i]);
        }
        inorder(root);
        System.out.println();
    //  if(search(root,5)){
    //     System.out.println("found");
    // }
    // else{
    //     System.out.println("not found");
    // }
    // delete(root,5);
    // inorder(root);
    // printinrange(root,4,10);
    printroot2leaf(root,new ArrayList<>());

    }
}





    
    


