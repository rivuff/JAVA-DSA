package graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

import static graph.graphUtils.Utils.addDirectedEdge;


public class Dijstra {
    static class Pair{
        int node;
        int distance;
        Pair(int node, int distance){
            this.node = node;
            this.distance = distance;
        }
    }

    public static void addDirectedEdgeWithWeight(List<List<List<Integer>>> graph, int from, int to, int weight){
        if(graph == null) throw new IllegalArgumentException("Graph cannot be null");
        int n = graph.size();

        if(from<0 || from>=n){
            throw new IllegalArgumentException("invalid from value, from:" + from);
        }

        if(to<0 || to>=n){
            throw new IllegalArgumentException("invalid to value, to:" + to);
        }

        graph.get(from).add(Arrays.asList(to, weight));
    }

    public static void addUndirectedEdge(List<List<List<Integer>>> graph, int from, int to, int weight){
        addDirectedEdgeWithWeight(graph, from, to, weight);
        addDirectedEdgeWithWeight(graph, to, from, weight);

    }

    public static void main(String[] args) {
       List<List<List<Integer>>> g = new ArrayList<>(14);

        for (int i = 0; i < 14; i++) {
            g.add(new ArrayList<>());
        }

        addUndirectedEdge(g, 0, 2, 4);
        addUndirectedEdge(g, 0, 3,2);
        addUndirectedEdge(g, 0, 6,3);
        addUndirectedEdge(g, 1, 4,5);
        addUndirectedEdge(g, 2, 6,6);
        addUndirectedEdge(g, 3, 1,2);
        addUndirectedEdge(g, 3, 4,4);
        addUndirectedEdge(g, 4, 5,5);
        addUndirectedEdge(g, 4, 8,1);
        addUndirectedEdge(g, 6, 7,2);
        addUndirectedEdge(g, 6, 11,2);
        addUndirectedEdge(g, 7, 4,5);
        addUndirectedEdge(g, 7, 12,1);
        addUndirectedEdge(g, 9, 2,10);
        addUndirectedEdge(g, 9, 10,1);
        addUndirectedEdge(g, 10, 6,6);
        addUndirectedEdge(g, 11, 12,2);
        addUndirectedEdge(g, 12, 8,1);

        int[] ans = shortestPath(g, 0, 14);

        System.out.println(Arrays.toString(ans));
    }

    public static int[] shortestPath(List<List<List<Integer>>> graph, int s, int v){
        PriorityQueue<Pair> pq = new PriorityQueue<>((x, y) -> x.distance - y.distance);
        pq.add(new Pair(s, 0));

        boolean[] vis = new boolean[v];
        int[] dis = new int[v];
        Arrays.fill(dis, (int)(1e9));

        while (!pq.isEmpty()){
            int node = pq.peek().node;
            int d = pq.peek().distance;

            List<List<Integer>> list = graph.get(node);
            pq.remove();

            for(int i = 0;i<list.size();i++){
                int ind = list.get(i).get(0);
                int weight = list.get(i).get(1);

                if(vis[ind]) continue;
                else vis[ind]= true;

                if(vis[ind]){
                    dis[ind] = Math.min(dis[ind], d+weight);
                }else {
                    dis[ind] = d+weight;
                }

                pq.add(new Pair(ind, dis[ind]));
            }
        }

        return dis;

    }
}
