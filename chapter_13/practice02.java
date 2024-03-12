
// largest number in array

public class practice02 {
    public static void main(String[] args) {
        int array[] = {4,7,133,6,8,10};
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<=5;i++){
            if(largest<=array[i]){
                largest=array[i];
            }
        }
        System.out.println("largest number is = " + largest);
    }
}
