public class tilingproblem {

    public static int tilingproblem(int n){
        if(n==1 ||n==0){
            return 1;
        }
        // vetical
        int vetical = tilingproblem(n-1);
        // horigontal
        int horigontal = tilingproblem(n-2);
        int ways = vetical + horigontal;
        return ways;
    } 
    public static void main(String[] args) {
        System.out.println(tilingproblem(4));
    }
}
