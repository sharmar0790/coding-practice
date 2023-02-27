package com.one7.dfs;

import java.util.Deque;
import java.util.LinkedList;

public class DepthFirstSearch<T> {
    public void traverse(Vertex<T> v0) {
        Deque<Vertex<T>> s = new LinkedList<>();
        s.push(v0);
        while (!s.isEmpty()) {
            Vertex<T> curr = s.pop();
            if (!curr.isVisited()) {
                curr.setVisited(true);
                System.out.println(curr);
                curr.getNeighbors().forEach(s::push);
            }
        }
    }

    public void traverseReversal(Vertex<T> v0) {
        System.out.println("Reversal");
        v0.setVisited(true);
        System.out.println(v0);
        v0.getNeighbors().forEach(n -> {
            if (!n.isVisited()) {
                traverseReversal(n);
            }
        });
    }
}
