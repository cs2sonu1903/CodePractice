package com.datastructure.tree;

public class BinaryTree {
    TreeNode root;
    public BinaryTree(){
        root=null;
    }
    public static void main(String[] args) {
        BinaryTree bnTree=new BinaryTree();
        bnTree.root=new TreeNode(1);
        bnTree.root.left=new TreeNode(2);
        bnTree.root.right=new TreeNode(3);
        bnTree.root.left.left=new TreeNode(4);
        bnTree.root.left.right=new TreeNode(6);
        bnTree.root.right.left=new TreeNode(7);
        bnTree.root.right.right=new TreeNode(8);

        System.out.println(bnTree);//address of tree

        //Depth first search
        DFS dfs=new DFS();

        System.out.println("Pre Order Tree");
        dfs.printPreOrder(bnTree.root);
        System.out.println();
        System.out.println("In Order Tree");
        dfs.printInOrder(bnTree.root);
        System.out.println();
        System.out.println("Post Order Tree");
        dfs.printPostOrder(bnTree.root);
        System.out.println();
        //----------------------------------------------------------------------//
        BFS bfs=new BFS();
        System.out.println("BFS Level Order");
        bfs.levelOrder(bnTree.root);


    }

   /* private static void printPostOrder(TreeNode root) {
        if (root==null)
            return;
        printPreOrder(root.left);
        printPreOrder(root.right);
        System.out.print(root.data+" ");
    }

    private static void printInOrder(TreeNode root) {
        if (root==null)
            return;
        printPreOrder(root.left);
        System.out.print(root.data+" ");
        printPreOrder(root.right);
    }

    private static void printPreOrder(TreeNode root) {
        if (root==null)
            return;
        System.out.print(root.data+" ");
        printPreOrder(root.left);
        printPreOrder(root.right);
    }*/


}
