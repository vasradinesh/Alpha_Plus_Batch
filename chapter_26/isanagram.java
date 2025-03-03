import java.util.HashMap;

public class isanagram {
    public static boolean isanagraam(String t,String s){
        HashMap<Character  , Integer> hm = new HashMap<>();

        for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);
            hm.put(ch,hm.getOrDefault(ch, 0)+1);
        }
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(hm.get(ch)!=null){
                if (hm.get(ch)==1) {
                    hm.remove(ch);
                }else{
                    hm.put(ch,hm.get(ch)-1);
                }
            }else{
                return false;
            }
        }
        return hm.isEmpty();

    }
    public static void main(String[] args) {
        String t = "dee";
        String p = "peed";
        System.out.println(isanagraam(t,p));

    }
}
