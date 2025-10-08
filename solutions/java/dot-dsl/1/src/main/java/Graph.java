import java.util.*;

public class Graph {
    
    private final Map<String, String> attributes = new LinkedHashMap<>();
    private final Set<Node> nodes = new LinkedHashSet<>();
    private final Set<Edge> edges = new LinkedHashSet<>();
    
    public Graph() {
    }

    public Graph(Map<String, String> attributes) {
        this.attributes.putAll(attributes);
    }

    public Collection<Node> getNodes() {
        return nodes;
    }

    public Collection<Edge> getEdges() {
        return edges;
    }

    public Graph node(String name) {
        nodes.add(new Node(name));
        return this;
    }

    public Graph node(String name, Map<String, String> attributes) {
        nodes.add(new Node(name, attributes));
        return this;
    }

    public Graph edge(String start, String end) {
        edges.add(new Edge(start, end));
        return this;
    }

    public Graph edge(String start, String end, Map<String, String> attributes) {
        edges.add(new Edge(start, end, attributes));
        return this;
    }

    public Map<String, String> getAttributes() {
         return attributes;
    }
}
