package Linkedlist;

public class implement {
     Node head;
     int size;
     implement(){
        this.size = 0;
     }
     
    class Node{
        int data;
        Node next;
        Node (int data){
            this.data=data;
            this.next=null;
            size++;
        }
    }
    // add first and addlast((
    public  void addfirst(int data){
        Node newnode = new Node(data); 
        if(head == null){
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }
    public  void addlast(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
            return;
        }
        Node currnode = head;
        while(currnode.next != null){
            currnode = currnode.next;
        }
        currnode.next = newnode;

    }
    //daletefirst and deletelast
    public void deletefirst(){
        //Node newnode = new Node(data);
        if(head == null){
            System.out.println("empty list");
        }
        size--;
        head = head.next;
       }

    public void deletelast(){
        if(head == null){
            System.out.print("emptylist");
        }
        size--;
        if(head.next == null){
            head = null;
            return;
        }
        Node scndlast = head;
        Node lastnode = head.next;
        while(lastnode.next != null){
            lastnode = lastnode.next;
            scndlast = scndlast.next;
        }
        scndlast.next = null;
    }   
    public void printlist(){
        
        if(head == null){
            System.out.print("list is Empty");
            return;
        }
        Node currnode = head;
        while(currnode != null){
            System.out.print(currnode.data+ "-->");
            currnode = currnode.next;
        }
        System.out.println("null");
    }
    public int getsize(){
        return size;
    }
  

    public static void main(String[] args) {
       implement list = new implement();
       list.addfirst(2);
       list.addfirst(1);
       list.addlast(3);
       list.addlast(4);
       list.printlist();
    
       list.deletefirst();
       list.deletelast(); 
       
       list.printlist();
       System.out.println(list.getsize());
    }
    
}
