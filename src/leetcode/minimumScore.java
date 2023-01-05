package leetcode;

import java.util.ArrayList;

public class minimumScore {
    public static void main(String[] args) {


    }

    static class Edge {
        int src;
        int nbr;
        int wt;

        Edge(int src, int nbr, int wt) {
            this.src = src;
            this.nbr = nbr;
            this.wt = wt;
        }
    }

    public static void drawTree(ArrayList<Edge>[]graph, int src, ArrayList< Integer> comp, boolean[]visited) {

        visited[src] = true;
        comp.add(src);
        for (Edge e : graph[src]) {
            if (visited[e.nbr] == false) {
                drawTree(graph, e.nbr, comp, visited);
            }
        }
    }


}
