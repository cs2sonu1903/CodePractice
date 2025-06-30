package com.datastructure.tree;

public class DFS {
    public void printInOrder(TreeNode root) {
        if (root==null)
            return;
        printPreOrder(root.left);
        System.out.print(root.data+" ");
        printPreOrder(root.right);
    }

    public void printPreOrder(TreeNode root) {
        if (root==null)
            return;
        System.out.print(root.data+" ");
        printPreOrder(root.left);
        printPreOrder(root.right);
    }
    public void printPostOrder(TreeNode root) {
        if (root==null)
            return;
        printPreOrder(root.left);
        printPreOrder(root.right);
        System.out.print(root.data+" ");
    }

}
