package graph;

import java.util.*;

/**
 * Created by szeru on 1/13/2019
 */
public class Graph {

    private Map<Integer, Node> noodLookup = new HashMap<>();

    private class Node {
        private int id;
        LinkedList<Node> adjecent = new LinkedList<>();
        private Node(int id){
            this.id = id;
        }
    }

    private Node getNode(int id){
        return noodLookup.get(id);
    }

    public void addEdge(int source, int dest){
        Node s = getNode(source);
        Node d = getNode(dest);
        s.adjecent.add(d);
    }

    public boolean hasPathDFS(int source, int dest){
        Node s = getNode(source);
        Node d = getNode(dest);
        Set<Integer> visited = new HashSet<>();
        return hasPathDFS(s, d, visited);
    }

    private boolean hasPathDFS(Node source, Node dist, Set<Integer> visited) {
        if(visited.contains(source.id)){
            return false;
        }

        visited.add(source.id);

        if(source == dist){
            return true;
        }

        for(Node child: source.adjecent){
            if(hasPathDFS(child, dist, visited)){
                return true;
            }
        }

        return  false;

    }

    public  boolean hasPathBFS(Node source, Node dest){
        LinkedList<Node> nextToVisit = new LinkedList();
        Set<Integer> visited = new HashSet<>();
        nextToVisit.add(source);

        while(!nextToVisit.isEmpty()){

            Node node = nextToVisit.remove();

            if(visited.contains(node.id)){
                continue;
            }

            if(node == dest){
                return true;
            }

            for(Node child : node.adjecent){
                nextToVisit.add(child);
            }

        }

        return false;

    }
}
