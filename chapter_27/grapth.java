import java.util.*;
public class grapth {
    public static class edge {
        int src;
        int des;
        int wt;

    public edge(int s,int d,int wt){
        this.src = s;
        this.des =d;
        this.wt = wt;
    }

}
    public static void main(String[] args) {

        int v = 5;        
        ArrayList<edge> [] graph = new ArrayList[v];

        for(int i=0 ;i<v ;i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new edge(0,1,5));

        graph[1].add(new edge(1,0,5));
        graph[1].add(new edge(1,2,1));
        graph[1].add(new edge(1,3,3));

        graph[2].add(new edge(2,1,1));
        graph[2].add(new edge(2,3,1));
        graph[2].add(new edge(2,4,4));

        for(int i=0;i<graph[1].size();i++){
            edge e = graph[1].get(i);
            System.out.println(e.des);
        }
    }
}
