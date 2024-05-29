public class permutation {
    public static void permutation(String str,String ans){
        //base case 
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }

        for(int j=0;j<str.length();j++){
            char curr = str.charAt(j);
            String newstr = str.substring(0, j) + str.substring(j+1);
            permutation(newstr, ans+curr);
        }
    }
    public static void main(String[] args) {
        String str  = "abc";
        permutation(str, "");

    }
}
