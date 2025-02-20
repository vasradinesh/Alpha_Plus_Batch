import java.util.*;
public class addatBottom {
    public static void addAtBottom(Stack<Integer> s , int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        addAtBottom(s, data);
        s.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        addAtBottom(s, 0);

        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}
