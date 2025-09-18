package com.gmail.zernetcsgo.hw20;

public class Main {
    public static void main(String[] args) {
        Graph g = new Graph(false);

        g.addVertex(1);
        g.addVertex(2);
        g.addVertex(3);

        g.addEdge(1, 2);
        g.addEdge(2, 3);

        System.out.println("Початковий граф: " + g);

        System.out.println("hasVertex(2): " + g.hasVertex(2));          // true
        System.out.println("hasEdge(1,2): " + g.hasEdge(1, 2));        // true (і 2-1 теж true у неорієнтованому)
        System.out.println("Сусіди 2: " + g.neighborsOf(2));           // [1,3]

        boolean removedEdge = g.removeEdge(1, 2);
        System.out.println("removeEdge(1,2): " + removedEdge);
        System.out.println("Після видалення ребра 1-2: " + g);
        System.out.println("hasEdge(1,2): " + g.hasEdge(1, 2));        // false

        boolean removedVertex = g.removeVertex(3);
        System.out.println("removeVertex(3): " + removedVertex);
        System.out.println("Після видалення вершини 3: " + g);
        System.out.println("hasVertex(3): " + g.hasVertex(3));          // false
        System.out.println("hasEdge(2,3): " + g.hasEdge(2, 3));         // false
    }
}
