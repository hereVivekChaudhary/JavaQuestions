package stack;

public class usingLL {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class Stacks{
        public static Node head;
        public static boolean isEmpty(){
            return head == null;
        }
    public static void push(int data){
        Node newnode = new Node(data);
        if(isEmpty()){
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }
    public static int pop(){
        if(isEmpty()){
          return -1;

        }
        int top = head.data;
        head = head.next;
        return top;
        
    }
    public static int peek(){
        if(isEmpty()){
            return -1;
        }
        return head.data;
    }

    }
    

    public static void main(String[] args) {
       Stacks st = new Stacks();
       st.push(1);
       st.push(2);
       st.push(3);
       st.push(4); 
       while(!st.isEmpty()){
        System.out.println(st.peek());
        st.pop();
       }
    }
    
}
