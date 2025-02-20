import java.util.*;;
public class reverseString {
    public static void reverseString(String word){
        Stack<Character> s =  new Stack<>();
        for(int i=0;i<word.length();i++){
            s.push(word.charAt(i)); 
        } 
        while (!s.isEmpty()) {
            System.out.print(s.pop());
        }
    }
    public static void main(String[] args) {
        reverseString("yoytty");
    }
}
