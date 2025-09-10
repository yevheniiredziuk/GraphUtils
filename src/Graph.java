import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {
    // TODO addVertex(int vertex) +
    // TODO addEdge(int source, int destination)
    // TODO removeVertex(int vertex)
    // TODO removeEdge(int source, int destination)
    // TODO hasVertex(int vertex)
    // TODO hasEdge(int source, int destination)


    private final Map<Integer, List<Integer>> adjList = new HashMap<>();

    public void addVertex(int vertex){
        adjList.put(vertex, new ArrayList<>());
    }

    public Map<Integer, List<Integer>> getAdjList(){
        return adjList;
    }

    public void removeVertex(int i){

        // it is possible to use Map's methods,
        // but it's unfair :)
        if(!this.containsVertex(i)){
            return;
        }
        for(List<Integer> neighbours : adjList.values()){
            if(neighbours.contains(i)){
                neighbours.remove(i);
            }
        }

        adjList.remove(i);
    }

    public boolean containsVertex(int v){
        return adjList.containsKey(v);
    }


}
