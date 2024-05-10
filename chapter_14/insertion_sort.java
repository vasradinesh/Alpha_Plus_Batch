public class insertion_sort {
    public static void insertion_sort(int array[]){
        for(int i=1;i<array.length;i++){
            int curr = array[i];
            int prev = i-1;
            while(prev>=0 && array[prev]>curr){
                array[prev+1] = array[prev];
                prev--;
            }
            array[prev+1]= curr;
        }
        for(int j=0;j<array.length;j++){
            System.out.println(array[j] + " ");
        }
    }   
    public static void main(String[] args) { 
        int array[] ={1,4,3,2,5};
        insertion_sort(array);
    }
}
