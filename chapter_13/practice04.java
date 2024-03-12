public class practice04 {
    public static void reverce_array(int array[]){
        int start = 0,end = array.length-1;
        while(start<end){
            int temp;
            temp = array[end];
            array[end]=array[start];
            array[start] = temp;

            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5,6,7};
        reverce_array(array);
        //to print array
        for(int i=0;i<=array.length-1;i++){
            System.out.print(array[i] + " ");
        }
    }
}
