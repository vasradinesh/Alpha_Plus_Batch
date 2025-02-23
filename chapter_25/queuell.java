import java.util.Queue;

import org.w3c.dom.Node;

public class queuell {
    static class Node {
        int data ;
        Node next;

        Node (int data){
            this.data = data;
            this.next = null;
        }
    }

    public static class QueueLL {
        static Node head = null;
        static Node tail = null;

        static boolean isEmpty(){
            return head ==null && tail==null; 
        }

        public static void add(int data){
            Node newnode = new Node(data);
            if (head == null) {
                head = tail = newnode;
                return;
            }
            tail.next = newnode;
            tail = newnode;
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            int front = head.data;
            if(head==tail){
                tail = head = null;
            }else{
                head = head.next;
            }
            return front;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }

            return head.data;
        }
    }
    public static void main(String[] args) {
        QueueLL q = new QueueLL();
        q.add(1);
        q.add(3);
        q.add(2);
        
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
