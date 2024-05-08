public class arrayisssorted {
    public static boolean issorted(int array[],int i ){
        if(array.length-1==i){
            return true;
        }
        if(array[i]>array[i+1]){
            return false;
        }
        return issorted(array, i+1);
    }
    public static void main(String[] args) {
        int array[] = {1,2,3,7,5};
        int i = 0;
        System.out.println(issorted(array,i));
    }
}
