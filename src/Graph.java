import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {
    // TODO addVertex(int vertex)
    // TODO addEdge(int source, int destination)
    // TODO removeVertex(int vertex)
    // TODO removeEdge(int source, int destination)
    // TODO hasVertex(int vertex)
    // TODO hasEdge(int source, int destination)


    private Map<Integer, List<Integer>> adjList = new HashMap<>();

    public void addVertex(int vertex){
        adjList.put(vertex, new ArrayList<>());
    }

    public Map<Integer, List<Integer>> getAdjList(){
        return adjList;
    }


}
