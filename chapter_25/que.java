// input = '123456'
// output = '142536'

import java.util.LinkedList;
import java.util.Queue;

public class que {
    public static void exchange(String str){
        Queue<Character> q = new LinkedList<>();
        int n = str.length();

        int count = 0;
        for(int i = 0;i<n/2;i++){
           q.add(str.charAt(i));
           q.add(str.charAt(i + n / 2)); 
        }
        while (!q.isEmpty()) {
            System.out.println(q.peek() + " ");
            q.remove();
        }
    }
    public static void main(String[] args) {
        String s = "abcdef";
        exchange(s);
    }
}
