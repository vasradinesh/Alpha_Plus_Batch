

public class LLCreate {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data  = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addlast(int data){
        // step  1 create node
        Node newnode = new Node(data);
        size++;

        if(head == null){ 
            head = tail = newnode;
            return;
        }
        // step 2
        tail.next = newnode;
        // step 3 
        tail = newnode;
    }


    public void addFirst(int data){
        // step  1 create node
        Node newnode = new Node(data);
        size++;
        
        if(head == null){
            head = tail = newnode;
            return;
        }
        
    //step 2 newnode next = head ;
        newnode.next = head;
    //step 3 head = newnode
        head = newnode;
        
    }

    public void print(){

        if(head==null){
            System.out.println("ll is empty");
            return;
        }
        Node temp = head;

        while(temp!=null){
            System.out.print(temp.data + "->>");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void add (int idx , int data){

        if(idx == 0){
            addFirst(data);
            return;
        }
        Node newnode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while (i<idx-1) {
            temp = temp.next;
            i++;   
        }
        newnode.next = temp.next;
        temp.next = newnode;
    }

    public int removefirst(){
        if(size==0){
            System.out.println("ll is empty");
            return Integer.MAX_VALUE;
        }else if (size == 1) {
            int val= head.data;
            size = 0;
            head = tail = null;
            return val;
        }
        int val = head.data;
        head  = head.next;
        size--;
        return val;
    }

    public int removelast(){
        if(size==0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
            
        }else if (size==1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        } 

        Node prev = head;
        int i = 0;

        while (i<size-2) {
            prev = prev.next;
            i++;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }


    public int searchkey(int key){
        Node temp = head ;
        int i = 0 ;

        while (temp.next != null) {
            if (temp.data == key) {
                return i ;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    public void reverce(){
        Node curr = tail = head;
        Node next ;
        Node prew = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prew;
            prew = curr;
            curr = next;
        }
        head = prew;
    }

    public void deleteNthFromEnd(int n){
        int sz=0;
        Node tempp = head;

        while (tempp!=null) {
            tempp = tempp.next;
            sz++;
        }

        if(n==sz){
            head = head.next;
            return;
        }

        int i = 1;
        int iToFind = sz-n;
        Node prew = head;
        while (i<iToFind) {
            prew = prew.next;
            i++;
        }
        prew.next = prew.next.next;
        return;
    }

    public static Boolean iscycle(){
        Node slow = head;
        Node fast = head;

        while (fast!=null && fast.next!=null) {
            slow = slow.next;  // +1
            fast = fast.next.next; //+2

            if (slow == fast) {
                return true; //cycle exist
            }
        }
        return false;
    }

    public static void main(String[] args){

        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head ;

        System.out.println(iscycle());

        // LLCreate ll = new LLCreate();
        // // ll.head = new Node(1);
        // // ll.head.next = new Node(2);
        // ll.addFirst(2);
        // ll.addFirst(1);
        // ll.addlast(3);
        // ll.addlast(4);
        // ll.add(3, 0);
        // ll.add(4, 4);
        // ll.add(3, 7);
        // ll.removefirst(); 
        // ll.removelast(); 
        // ll.print(); 
        // ll.reverce();
        // ll.print(); 
        // ll.deleteNthFromEnd(3);
        // ll.print(); 
        // ll.reverce();
        // ll.print(); 


        // System.out.println(ll.searchkey(3));
        // System.out.println(ll.size);
    }
}
