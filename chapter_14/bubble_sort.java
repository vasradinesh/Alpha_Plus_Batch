

public class bubble_sort {
    public static void bubble_sort(int array[]){
        for(int turn=0;turn < array.length-1;turn++){
            int swap = 0;
            for(int i=0;i<array.length-1-turn;i++){
                if(array[i]>array[i+1]){
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    swap++;
                }
            }
            if(swap==0){
                break;
            }
        }
        for(int j=0;j<array.length;j++){
            System.out.println(array[j] + " ");
        }
    }
    public static void main(String[] args) {
        int array[] = {6,5,4,3,2};
        bubble_sort(array);
    }
}