public class selection_sort {
    public static void selection_sort(int array[]){
        for (int i=0;i<array.length-1;i++){
            int min = i;
            for(int j=i+1;j<array.length-1;j++){
                if(array[min]>array[j]){
                    min = j;
                }
            }
            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
        for(int j=0;j<array.length;j++){
            System.out.println(array[j] + " ");
        }
    }
    public static void main(String[] args) {
        int array[] = {1,4,5,2,7};
        selection_sort(array);
    }
}
