package graph.graphUtils;

import java.util.ArrayList;
import java.util.List;

public class Utils {
    public static List<List<Integer>> createEmptyAdjacencyList(int n){
        if(n<0) throw new IllegalArgumentException("n cannot be negative; received: " + n);

        List<List<Integer>> list = new ArrayList<>(n);
        for(int i =0;i<n;i++){
            list.add(new ArrayList<>());
        }
        return list;
    }

    public static void addDirectedEdge(List<List<Integer>> graph, int from, int to){
        if(graph == null) throw new IllegalArgumentException("Graph cannot be null");
        int n = graph.size();

        if(from<0 || from>=n){
            throw new IllegalArgumentException("invalid from value, from:" + from);
        }

        if(to<0 || to>=n){
            throw new IllegalArgumentException("invalid to value, from:" + to);
        }

        graph.get(from).add(to);
    }

    public static void addUndirectedEdge(List<List<Integer>> graph, int from, int to){
        addDirectedEdge(graph, from, to);
        addDirectedEdge(graph, to, from);

    }
}
