package com.greatlearning.dsa2;

public class Main {
    public Node node;
    static Node previous = null, head = null;
    Node bstToSkewed(Node root,int asc) {
        if(root == null) {
            return null;
        }
        if(asc > 0) {
            bstToSkewed(root.right, asc);
        }
        else {
            bstToSkewed(root.left, asc);
        }
        Node right = root.right;
        Node left = root.left;
        if(head == null) {
            head = root;
            root.left = null;
            previous = root;
        }
        else {
            previous.right = root;
            root.left = null;
            previous = root;
        }
        if(asc > 0) {
            bstToSkewed(left, asc);
        }
        else {
            bstToSkewed(right, asc);
        }
        return head;
    }
    void traverseSkewed(Node root) {
        if(root == null) {
            return;
        }
        System.out.print(root.data + " ");
        traverseSkewed(root.right);       
    }
}
