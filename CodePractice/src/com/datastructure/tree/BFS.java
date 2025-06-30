package com.datastructure.tree;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public void levelOrder(TreeNode root){
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while (q.size()>0){
            int size=q.size();
            System.out.print("Level "+size+" :- ");
            for (int i = 0; i < size; i++) {
            TreeNode remove = q.remove();
            System.out.print(remove.data+" ");
            if (remove.left!=null)
                q.add(remove.left);
            if (remove.right!=null)
                q.add(remove.right);
            }
            System.out.println();
        }
    }
}
