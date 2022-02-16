package com.greatlearning.dsa2;

public class Skewed {
    public static Node headNode = null;
    public static void main(String[] args) {
        System.out.println("\nBinary Search Tree into a Skewed Tree ->");
        Main bst = new Main();
        bst.node = new Node(50);
        bst.node.left = new Node(30);
        bst.node.right = new Node(60);
        bst.node.left.left = new Node(10);
        bst.node.right.left = new Node(55);
        int order = 0;
        headNode = bst.bstToSkewed(bst.node, order);
        bst.traverseSkewed(headNode);
        System.out.println("\n");
    }
}
