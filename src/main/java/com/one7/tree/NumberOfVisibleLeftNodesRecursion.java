package com.one7.tree;

public class NumberOfVisibleLeftNodesRecursion {
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
        int c = 0;
//        max_level = 0;
        c = printLeftView(root, 1, c);
        return c;
    }

    private static int printLeftView(Node root, int level, int c) {

        if (max_level < level) {
            c++;
            max_level = level;
        }

        if (root.left != null)
            c = printLeftView(root.left, level + 1, c);
        if (root.right != null)
            c = printLeftView(root.right, level + 1, c);
        return c;
    }

}
