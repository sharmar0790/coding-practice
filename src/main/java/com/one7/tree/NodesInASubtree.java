package com.one7.tree;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class NodesInASubtree {

    static int[] countOfNodes(Node root, ArrayList<Query> queries, String s) {
        // Write your code here
        if (root == null) return new int[]{0};

        List<Integer> list = new ArrayList<>();
        HashMap<Character, Integer> map;

        for (Query q : queries) {
            char c = q.c;
            int u = q.u;
            Node curr = null;
            map = new HashMap<>();
            if (root.val != u) {
                for (Node node : root.children) {
                    if (node.val == u) {
                        curr = node;
                    }
                }
            } else {
                curr = root;
            }

            if (curr != null) {
                traverse(curr, c, map, s);
            }

            if (!map.isEmpty()) { // Remove empty Hash
                list.add(map.get(c));
            }

        }
        return list.stream().mapToInt(i -> i).toArray();
    }

    public static void traverse(Node root, char c,
                                HashMap<Character, Integer> hm, String s) {
        if (root == null) return;

        if (s.charAt(root.val - 1) == c) { // Save if match query
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }

        for (Node value : root.children) { // Traverse the tree
            traverse(value, c, hm, s);
        }

        return;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(Arrays.toString(new NodesInASubtree().run()));
    }

    public int[] run() throws IOException {
        //Testcase 1
        String s_1 = "aaa";
        Node root_1 = new Node(1);
        root_1.children.add(new Node(2));
        root_1.children.add(new Node(3));
        ArrayList<Query> queries_1 = new ArrayList<>();
        queries_1.add(new Query(1, 'a'));
        return countOfNodes(root_1, queries_1, s_1);
    }

    class Node {
        public int val;
        public List<Node> children;

        public Node() {
            val = 0;
            children = new ArrayList<Node>();
        }

        public Node(int _val) {
            val = _val;
            children = new ArrayList<Node>();
        }

        public Node(int _val, ArrayList<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    class Query {
        int u;
        char c;

        Query(int u, char c) {
            this.u = u;
            this.c = c;
        }
    }

}
