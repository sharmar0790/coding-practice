package com.one7.bfs;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {

    private final Vertex<Integer> vertex;

    public BreadthFirstSearch(Vertex<Integer> vertex) {
        this.vertex = vertex;
    }

    public void traverse() {
        Queue<Vertex<Integer>> q = new LinkedList<>();
        q.offer(this.vertex);
        while (!q.isEmpty()) {
            Vertex<Integer> curr = q.poll();
            if (!curr.isVisited()) {
                curr.setVisited(true);
                System.out.println(curr);
                q.addAll(curr.getNeighbors());
            }
        }
    }
}
