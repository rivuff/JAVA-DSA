package graph;

import graph.graphUtils.Utils;

import java.util.*;

import static graph.graphUtils.Utils.addDirectedEdge;
import static graph.graphUtils.Utils.createEmptyAdjacencyList;

public class TopoSort {
    public static void main(String[] args){
        exampleFromSlides();
    }

    static class Edge {
        int from, to, weight;

        public Edge(int f, int t, int w) {
            from = f;
            to = t;
            weight = w;
        }
    }


    public static int dfs(int i, int at,  int[] order, int[] visited, Map<Integer,  List<Edge>> graph){

        visited[at] = 1;

        List<Edge> edges = graph.get(at);


        if(edges!=null){
            for (Edge edge: edges){
                if(visited[edge.to]!=1){
                    dfs(i, edge.to, order, visited, graph);
                }
            }
        }

        order[i] = at;
        return i-1;

    }

    public int[] TopoSort(Map<Integer,  List<Edge>> edge, int numNodes){
        int n = 7;

        int visited[] = new int[n];
        Arrays.fill(visited, 0);
        int order[] = new int[n];

        for(int i =0;i<n;i++){
            if(visited[i]!= 1){
                dfs(n-1, i, order, visited, edge);
            }
        }

        return order;
    }

    public static int[] kahns(List<List<Integer>> graph){
        int n = graph.size();
        int [] inDegree = new int[n];

        for(List<Integer> edges : graph){
            for(int to : edges){
                inDegree[to]++;
            }
        }

        Queue<Integer> q = new LinkedList<>();

        for(int i = 0;i<n;i++){
            if(inDegree[i]==0){
                q.add(i);
            }
        }

        int index = 0;
        int[] order = new int[n];

        while (!q.isEmpty()){
            int at = q.poll();
            order[index++] = at;

            for(int val : graph.get(at)){
                inDegree[val]--;
                if(inDegree[val] == 0){
                    q.add(val);
                }
            }
        }

        if(index!=n){
            throw new IllegalArgumentException("Graph is not acyclic");
        }
        return order;
    }

    private static void exampleFromSlides() {
        List<List<Integer>> g = createEmptyAdjacencyList(14);
        addDirectedEdge(g, 0, 2);
        addDirectedEdge(g, 0, 3);
        addDirectedEdge(g, 0, 6);
        addDirectedEdge(g, 1, 4);
        addDirectedEdge(g, 2, 6);
        addDirectedEdge(g, 3, 1);
        addDirectedEdge(g, 3, 4);
        addDirectedEdge(g, 4, 5);
        addDirectedEdge(g, 4, 8);
        addDirectedEdge(g, 6, 7);
        addDirectedEdge(g, 6, 11);
        addDirectedEdge(g, 7, 4);
        addDirectedEdge(g, 7, 12);
        addDirectedEdge(g, 9, 2);
        addDirectedEdge(g, 9, 10);
        addDirectedEdge(g, 10, 6);
        addDirectedEdge(g, 11, 12);
        addDirectedEdge(g, 12, 8);

        int[] order = kahns(g);

        System.out.println(Arrays.toString(order));

        // Prints: [0, 9, 13, 3, 2, 10, 1, 6, 7, 11, 4, 12, 5, 8]
        //System.out.println(java.util.Arrays.toString(ordering));
    }
}
