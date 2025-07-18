import java.nio.file.NotDirectoryException;

import org.w3c.dom.Node;

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

    public static void removeCycle(){
        Node slow = head;
        Node fast = head;
        Boolean cycle = false;

        while (fast!=null && fast.next!=null) {
            slow = slow.next;  // +1
            fast = fast.next.next; //+2

            if (fast ==slow) {
                cycle = true;
                break ; //cycle exist
            }
        }
        if (cycle == false) {
            return;
        }
        // finding meeting point
        slow = head;
        Node prev = null;
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        // remove cycle
     if (prev != null) {
        prev.next = null;  // Remove cycle
        }
    }

    public static Node merge(Node head1, Node head2){
        Node mergedll = new Node(-1);
        Node temp = mergedll;

        while (head1!=null && head2!=null) {
            if(head1.data<=head2.data){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }

        while (head1!=null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while (head2!=null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergedll.next;

    }

    public static Node getmid(Node head){
        Node slow = head;
        Node fast= head.next;

        while (fast!=null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; //mid node 
    }


    public Node mergesort(Node head){
        if(head==null ||head.next == null){
            return head;
        }

        // find mid
        Node mid = getmid(head);
        // find right and left  and merge sort
        Node righthead = mid.next;
        mid.next = null;
        Node newleft =  mergesort(head);
        Node newright = mergesort(righthead);
        // merge
        
        return merge(newleft,newright); 
    }

    public static void main(String[] args){

        LLCreate ll = new LLCreate();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.print();
        ll.head = ll.mergesort(ll.head);
        ll.print();
        // head = new Node(1);
        // Node temp = new Node(2);
        // head.next = temp;
        // head.next.next = new Node(3);
        // head.next.next.next = temp ;

        // System.out.println(iscycle());
        // removeCycle();
        // System.out.println(iscycle());
       
        // // ll.head = new Node(1);
        // // ll.head.next = new Node(2);
       
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
