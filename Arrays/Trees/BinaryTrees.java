package Trees;
import java.lang.Math;
import java.util.*;


public class BinaryTrees {
   public  static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
     public static class BinaryTree{
        static int idx=-1;
        public   Node buildTree(int[] nodes){
                idx++;
                if(nodes[idx] == -1){
                    return null;
                }
                Node newnode = new Node(nodes[idx]);
                newnode.left = buildTree(nodes);
                newnode.right = buildTree(nodes);
                return newnode;
        }
     }
     //tree traversal of tree--preorder,inorder,postorder,lavelorder
     public static void preorder(Node root){
        if(root==null){
            return ;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
     }
     public static void inorder(Node root){
        if(root==null){
            return ;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
     }
     public static void postorder(Node root){
        if(root==null){
            return ;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
       

     }
     // lavelorder
     public static void levelorder(Node root){
        Queue<Node> q= new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node num= q.remove();
            if(num == null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                System.out.print(num.data+" ");
                if(num.left != null){
                    q.add(num.left);
                }
                if(num.right != null){
                    q.add(num.right);
                }

            }
        }

     }
     //height of tree
     public static int height(Node root){
        if(root == null){
            return 0;
        }
        int heightleft = height(root.left);
        int heightright = height(root.right);
        int treeheight=Math.max(heightleft,heightright) + 1;
        return treeheight;
     }

     //no of nodes
     public static int noOfnodes(Node root){
        if(root == null){
            return 0;
        }
        int leftnodes = noOfnodes(root.left);
        int rightnodes = noOfnodes(root.right);
        int treenodes=  leftnodes + rightnodes + 1;
        return treenodes;
     }
     //sum of nodes
     public static int sumOfnodes(Node root){
        
        if(root == null){
            return 0;
        }
        int leftnodes = sumOfnodes(root.left);
        int rightnodes = sumOfnodes(root.right);
        int sumnodes= + leftnodes + rightnodes + root.data;
        return sumnodes;
     }
     //DIAMETER OF A TREE
     //APPROACH 1 OF O(N^2)
    //  public static int diameter(Node root){
    //     if(root == null){
    //         return 0;
    //     }
    //     int d1 = height(root.left) + height(root.right) + 1;
    //     int d2 = diameter(root.left);
    //     int d3 = diameter(root.right);
    //     int diam = Math.max(d1,Math.max(d2,d3));
    //     return diam;
    // }
     //approach 2 of O(n)
     static class treeinfo{
        int ht;
        int diam;
        treeinfo(int ht,int diam){
            this.ht = ht;
            this.diam = diam;
        }
        }

     public static treeinfo diameter2(Node root){
        if(root == null){
            return new treeinfo(0,0);
        }
        treeinfo left= diameter2(root.left);
        treeinfo right = diameter2(root.right);
        int myheight = Math.max(left.ht,right.ht) + 1;
        int diam1 = left.diam;
        int diam2 = right.diam;
        int diam3 = left.ht +right.ht +1;
        int mydiam = Math.max(Math.max(diam1,diam2),diam3);

        treeinfo myinfo = new treeinfo(myheight,mydiam);
        return myinfo;


     }
        
     
    
    public static void main(String[] args) {
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        //System.out.println(root.data);
         
       // postorder(root);
       //levelorder(root);
        //int h= height(root);
        //System.out.println("height of a tree:"+h);
        int n= noOfnodes(root);
        System.out.println("no of nodes:"+n);
        //int s= sumOfnodes(root);
        //System.out.println("sum of nodes :"+s);
       // int d=diameter(root);
        //System.out.println(d);
       //System.out.println(diameter2(root).diam);
    

        

    }
}

