public class gridWAYS {
    public static int ways(int i ,int j ,int  m,int  n){
        if(i==n-1 && j==m-1){
            return 1;
        }
        else if(i==n || j==m){
            return 0;
        }
        int w1 = ways(i+1, j, m, n);
        int w2 = ways(i, j+1, m, n);
        return w1 + w2;
    }
    public static void main(String[] args) {
        int n=2,m=2;
        System.out.println(ways(0, 0, m, n));
    }
}
