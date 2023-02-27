package com.one7.tree;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfVisibleLeftNodesQueue {
    static int max_level = 0;

    public static void main(String[] args) {
        Node root_1 = new Node(8);
        root_1.left = new Node(3);
        root_1.right = new Node(10);
        root_1.left.left = new Node(1);
        root_1.left.right = new Node(6);
        root_1.right.right = new Node(14);
        root_1.left.right.left = new Node(4);
        root_1.left.right.right = new Node(7);
        root_1.right.right.left = new Node(13);
        System.out.println(visibleNodes(root_1));

        Node root_2 = new Node(10);
        root_2.left = new Node(8);
        root_2.right = new Node(15);
        root_2.left.left = new Node(4);
        root_2.left.left.right = new Node(5);
        root_2.left.left.right.right = new Node(6);
        root_2.right.left = new Node(14);
        root_2.right.right = new Node(16);
        System.out.println(visibleNodes(root_2));
    }

    private static int visibleNodes(Node root) {
        return printLeftView(root);
    }

    private static int printLeftView(Node root) {
        int c = 0;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            // number of nodes at current level
            int n = queue.size();

            // Traverse all nodes of current level
            for (int i = 1; i <= n; i++) {
                Node temp = queue.poll();

                // Print the left most element at
                // the level
                if (i == 1) {
//                    System.out.print(temp.data + " ");
                    c++;
                }

                // Add left node to queue
                if (temp.left != null) queue.add(temp.left);

                // Add right node to queue
                if (temp.right != null) queue.add(temp.right);
            }
        }
        return c;
    }

}
