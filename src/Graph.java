import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {
    // TODO addVertex(int vertex) +
    // TODO addEdge(int source, int destination) +
    // TODO removeVertex(int vertex) +
    // TODO removeEdge(int source, int destination)
    // TODO hasVertex(int vertex) +
    // TODO hasEdge(int source, int destination) +


    private final Map<Integer, List<Integer>> adjList = new HashMap<>();

    public void addVertex(int vertex){
        adjList.put(vertex, new ArrayList<>());
    }

    public Map<Integer, List<Integer>> getAdjList(){
        return adjList;
    }

    public void removeVertex(int vertex){

        // it is possible to use Map's methods,
        // but it's unfair :)
        if(!this.hasVertex(vertex)){
            return;
        }
        for(List<Integer> neighbours : adjList.values()){
            if(neighbours.contains(vertex)){
                neighbours.remove(vertex);
            }
        }

        adjList.remove(vertex);
    }

    public boolean hasVertex(int v){
        return adjList.containsKey(v);
    }

    public boolean hasEdge(int source, int destination){
        List<Integer> neighbours = adjList.get(source);
        return neighbours.contains(destination);
    }

    public void addEdge(int source, int destination){
        if(!this.hasVertex(source) || !this.hasVertex(destination)){
            return;
        }

        adjList.get(source).add(destination);
        adjList.get(destination).add(source);
    }

    public void removeEdge(int source, int destination){
        if(!this.hasVertex(source) || !this.hasVertex(destination)){
            return;
        }

        adjList.get(source).remove(Integer.valueOf(destination));
        adjList.get(destination).remove(Integer.valueOf(source));
    }

}
