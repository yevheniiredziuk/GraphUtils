import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Graph graph  = new Graph();
        graph.addVertex(2);
        graph.addVertex(4);
        graph.addVertex(5);

        graph.getAdjList()
                .forEach((key, values)
                        -> System.out.println(key + " -> " + values));


    }
}