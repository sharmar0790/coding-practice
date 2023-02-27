package com.one7.tree;

public class NumberOfVisibleRightNodesRecursion {
    static int max_level = 0;

    public static void main(String[] args) {
        Node root_2 = new Node(1);
        root_2.left = new Node(2);
        root_2.right = new Node(3);
        root_2.left.left = new Node(4);
        root_2.left.right = new Node(5);
        root_2.right.left = new Node(6);
        root_2.right.right = new Node(7);
        root_2.right.left.right = new Node(8);
        System.out.println(visibleNodes(root_2));
    }

    private static int visibleNodes(Node root) {
        int c = 0;
        max_level = 0;
        c = printRightView(root, 1, c);
        return c;
    }

    private static int printRightView(Node root, int level, int c) {

        if (max_level < level) {
            c++;
            max_level = level;
            System.out.println(root.data);
        }

        if (root.right != null)
            c = printRightView(root.right, level + 1, c);

        if (root.left != null)
            c = printRightView(root.left, level + 1, c);

        return c;
    }

}
