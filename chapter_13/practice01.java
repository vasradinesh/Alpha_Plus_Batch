
// linear search

public class practice01 {
    public static void main(String[] args) {
        int marks[] = {4,5,6,7,8,9};
        int key = 6;

        for(int i=0;i<marks.length;i++){
            if(key==marks[i]){
                System.out.println("mark " + marks[i] + " is present in marks array");
            }
        }
    }
}
