public class Main {
    public static void main(String[] args) {
        Graph graph  = new Graph();
        graph.addVertex(2);
        graph.addVertex(4);
        graph.addVertex(5);

        graph.getAdjList()
                .forEach((key, values)
                        -> System.out.println(key + " -> " + values));

        graph.addEdge(2,4);
        graph.addEdge(2,5);

        graph.getAdjList()
                .forEach((key, values)
                        -> System.out.println(key + " -> " + values));

        System.out.println(graph.hasEdge(2, 4));
    }
}