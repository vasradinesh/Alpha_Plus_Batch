
//code for print maxsubarray sum 

public class practice07 {
    public static void maxsubarraysum(int number[]){
        int currentsum =0;
        int maxsum = Integer.MIN_VALUE;
        for(int i=0;i<number.length;i++){
            int start =i;
            for(int j=i;j<number.length;j++){
                currentsum = 0;
                int end = j;
                for(int k=start;k<=end;k++){
                    currentsum+=number[k];
                }
                if(maxsum<currentsum){
                    maxsum=currentsum;
                }
            }
        }
        System.out.println("maxsum is " + maxsum);
    }
    public static void main(String[] args) {
        int number[] = {1,2,3,4,5};
        maxsubarraysum(number);
    }
}
