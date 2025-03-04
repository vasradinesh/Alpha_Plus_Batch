import java.util.HashMap;

public class travelroot {

    public static String start(HashMap<String,String> tickets){
        HashMap<String,String> revtic = new HashMap<>();
        for (String key : tickets.keySet()) {
            revtic.put(tickets.get(key), key);
        }
        for (String key :tickets.keySet()) {
            if (!revtic.containsKey(key)) {
                return key;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        HashMap<String , String> tickets = new HashMap<>();
        tickets.put("chennai","goa");
        tickets.put("delhi","mumbai");
        tickets.put("mumbai","dodo");
        tickets.put("dodo","chennai");

        String start = start(tickets);
        System.out.print(start);
        for (String key : tickets.keySet()) {
            System.out.print("-> " + tickets.get(start));
            start = tickets.get(start);
        }
        System.out.println();
    }
}
