package com.one7.tree;

class Node {
    int data;
    Node left;
    Node right;

    Node() {
        this.data = 0;
        this.left = null;
        this.right = null;
    }

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class NumberOfVisibleLeftNodes {

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

        int visibleNode = 1;
        if (root == null) {
            return 0;
        }
        while (root != null) {
            if (root.left != null) {
                visibleNode++;
                if (root.left.left != null) {
                    root = root.left;
                } else if (root.left.right != null) {
                    root = root.left;
                } else {
                    root = root.right;
                }
            } else if (root.right != null) {
                visibleNode++;
                if (root.right.left != null) {
                    root = root.right;
                } else if (root.right.right != null) {
                    root = root.right;
                } else {
                    break;
                }
            } else {
                break;
            }
        }
        return visibleNode;
    }
}
