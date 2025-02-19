import java.util.*;
public class stack {
    static class Stack{
        static ArrayList<Integer> list = new ArrayList<>();
        public Boolean isempty(){
            return list.size() == 0;
        }
        // push

        public void push(int data){
            list.add(data);
        }
        // pop
        public int pop(){
            int top = list.get(list.size() - 1);
            list.remove(list.size()-1);
            return top;
        }
        // peek
        public int peek(){
            int top = list.get(list.size() - 1);
            return top;
        } 
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while (!s.isempty()) {
            System.out.println(s.peek());
            s.pop();
        }

    }
}
