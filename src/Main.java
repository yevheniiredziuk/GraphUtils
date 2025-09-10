public class Main {
    public static void main(String[] args) {
        Graph graph  = new Graph();
        graph.addVertex(2);
        graph.addVertex(4);
        graph.addVertex(5);
        graph.addVertex(9);
        graph.addVertex(1);

        graph.addEdge(2,4);
        graph.addEdge(2,5);
        graph.addEdge(4,9);
        graph.addEdge(5,9);
        graph.addEdge(9,2);

        System.out.println("graph with all vertexes and edges: ");
        printGraphAdjacencyList(graph);

        graph.removeVertex(1);
        graph.removeEdge(2, 4);

        System.out.println("graph after vertex 1 and edge [2,4] were deleted: ");
        printGraphAdjacencyList(graph);

        System.out.printf("does graph have edge [%d,%d] -> %b%n",2, 4, graph.hasEdge(2,4));

        System.out.printf("does graph have vertex %d -> %b%n", 5, graph.hasVertex(5));

    }

    public static void printGraphAdjacencyList(Graph graph){
        graph.getAdjList()
                .forEach((key, values)
                        -> System.out.println(key + " -> " + values));
    }
}