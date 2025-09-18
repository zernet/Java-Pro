package com.gmail.zernetcsgo.hw20;

import java.util.*;

public class Graph {
    private final boolean directed;
    private final Map<Integer, Set<Integer>> adj = new HashMap<>();

    public Graph(boolean directed) {
        this.directed = directed;
    }

    public boolean addVertex(int vertex) {
        return adj.putIfAbsent(vertex, new HashSet<>()) == null;
    }

    public boolean addEdge(int source, int destination) {
        addVertex(source);
        addVertex(destination);

        boolean changed = adj.get(source).add(destination);
        if (!directed) {
            changed |= adj.get(destination).add(source);
        }
        return changed;
    }

    public boolean removeVertex(int vertex) {
        Set<Integer> removed = adj.remove(vertex);
        if (removed == null) return false;

        for (Set<Integer> neighbors : adj.values()) {
            neighbors.remove(vertex);
        }
        return true;
    }

    public boolean removeEdge(int source, int destination) {
        boolean changed = false;
        if (adj.containsKey(source)) {
            changed = adj.get(source).remove(destination);
        }
        if (!directed && adj.containsKey(destination)) {
            changed |= adj.get(destination).remove(source);
        }
        return changed;
    }

    public boolean hasVertex(int vertex) {
        return adj.containsKey(vertex);
    }

    public boolean hasEdge(int source, int destination) {
        return adj.containsKey(source) && adj.get(source).contains(destination);
    }

    public Set<Integer> neighborsOf(int vertex) {
        return adj.getOrDefault(vertex, Collections.emptySet());
    }

    @Override
    public String toString() {
        return (directed ? "Directed" : "Undirected") + "Graph" + adj;
    }
}