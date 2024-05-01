package Lec47;

import Lec47.Graph;

public class Graph_client {
    public static void main(String[] args) {
        Graph g=new Graph(6);
        g.AddEdge(1,2,6);
        g.AddEdge(1,3,7);
        g.AddEdge(3,4,8);
        g.AddEdge(4,2,5);
        g.AddEdge(4,5,1);
        g.AddEdge(2,5,2);
        g.AddEdge(5,6,3);
        g.display();
        System.out.println("***********************");
        g.Remove(1,2);
        g.display();

    }
}
