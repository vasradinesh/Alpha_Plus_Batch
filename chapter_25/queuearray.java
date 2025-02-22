public class queuearray {
     static class queue{
        static int arr[];
        static int size ;
        static int rear;

        queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
        }
    

        public static  boolean isempty(){
            return rear ==-1;
        }

        public static void add(int data){
            if(rear == size -1 ){
                System.out.println("queue is full");
                return;
            }
            rear = rear + 1;
            arr[rear] = data;
        }
        public static int remove(){
            if(isempty()){
                System.out.println("queue is empty");
                return -1;
            }
            int front = arr[0];
            for(int i=0;i<size-1;i++){
                arr[i] = arr[i+1];
            }
            rear = rear-1;
            return front;
        }
        public static int peek(){
            if(isempty()){
                System.out.println("queue is empty");
                return -1;
            }

            return arr[0];
        }

    }

    
    public static void main(String[] args) {
    
        queue q = new queue(5);
        q.add(0);
        q.add(1);
        q.add(2);

        while (!q.isempty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
