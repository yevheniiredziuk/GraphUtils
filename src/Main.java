public class Main {
    public static void main(String[] args) {
        Graph graph  = new Graph();
        graph.addVertex(2);
        graph.addVertex(4);
        graph.addVertex(5);
        graph.addVertex(9);
        graph.addVertex(1);

        graph.removeVertex(1);
        graph.addEdge(2,4);
        graph.addEdge(2,5);
        graph.addEdge(4,9);
        graph.addEdge(5,9);
        graph.addEdge(9,2);

        graph.removeEdge(2, 4);

        graph.getAdjList()
                .forEach((key, values)
                        -> System.out.println(key + " -> " + values));

        System.out.println(graph.hasEdge(2, 4));
        System.out.println(graph.hasVertex(5));
    }
}