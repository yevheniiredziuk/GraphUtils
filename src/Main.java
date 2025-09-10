public class Main {
    public static void main(String[] args) {
        Graph graph  = new Graph();
        graph.addVertex(2);
        graph.addVertex(4);
        graph.addVertex(5);

        graph.getAdjList()
                .forEach((key, values)
                        -> System.out.println(key + " -> " + values));

        graph.getAdjList().remove(4);

        graph.getAdjList()
                .forEach((key, values)
                        -> System.out.println(key + " -> " + values));

    }
}