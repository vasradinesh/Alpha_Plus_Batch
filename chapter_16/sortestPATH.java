

public class sortestPATH {
    public static float sortestpath(String path){
        int x=0,y=0;
        for(int i=0;i<path.length();i++){
            int Mi = path.charAt(i);
            // south
            if(Mi=='S'){
                y--;
            }
            if(Mi=='w'){
                x--;
            }
            if(Mi=='N'){
                y++;
            }
            if(Mi=='E'){
                x++;
            }
        }
        int x2 = x*x;
        int y2 =y*y;
        return (float) Math.sqrt(y2 + x2);
    }
    public static void main(String[] args) {
        String path = "NS";
        System.out.println(sortestpath(path));
    }
}
