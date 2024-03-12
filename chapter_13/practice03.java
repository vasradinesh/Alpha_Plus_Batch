
//binary search 

public class practice03 {
    public static int binarysearch(int number[],int key){
        int start =0,end =number.length-1;
        while(start<=end){
            int mid = (start + end) / 2;
            if(number[mid]==key){
                return mid;                     //found 
            }
            else if(number[mid]<key){
                start = mid + 1;                //right
            }
            else{
                end = mid - 1;                  //left
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int number[] = {1,2,4,6,3,5,24,7};
        int key = 24;
        System.out.println("index for key is : " + binarysearch(number, key));
    }
}
