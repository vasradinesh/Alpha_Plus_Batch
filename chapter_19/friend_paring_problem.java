public class friend_paring_problem {
    public static int friend_paring(int n){
        if(n==1 || n==2){
            return n;
        }
        // single 
        int single = friend_paring(n-1);
        //pair 
        int pair = (n-1) * friend_paring(n-2);
        int ways = pair + single;
        return  ways;
    }
    public static void main(String[] args) {
        System.out.println(friend_paring(6));
    }
}
