public class removeduplicate {

    public static void removeduplicate(String str,int idx, StringBuilder newstr,boolean map[]){
        if(idx == str.length()){
            System.out.println(newstr);
            return ;
        }
        // work
        char currchar = str.charAt(idx);
        if(map[currchar -'a']==true){
            removeduplicate(str, idx+1, newstr, map);
        }
        else{
            map[currchar-'a']=true;
            removeduplicate(str, idx+1, newstr.append(currchar), map);
        }
    }
    public static void main(String[] args) {
        String str = "mummy";
        StringBuilder newstr = new StringBuilder("");
        boolean map[] = new boolean[26];
        removeduplicate(str, 0, newstr, map);
    }
}
