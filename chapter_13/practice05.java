
//code for print pairs in array

public class practice05 {

    public static void pairsinarray(int number[]){
        int i,j;
        for(i=0;i<number.length;i++){
            int current = number[i];
            for(j=i+1;j<number.length;j++){
                System.out.print("( " + current + "," + number[j] +" )");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int number[] = {1,2,3,4,5};
        pairsinarray(number);
    } 
}
