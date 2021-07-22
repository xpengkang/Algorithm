package com.ucas.tree.bfs;

import java.util.LinkedList;
import java.util.Queue;

public class L1302 {
}
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class SolutionBFS {
    public int deepestLeavesSum(TreeNode root) {
        //not null check
        if(root == null) return -1;
        Queue<TreeNode> queue = new LinkedList();
        queue.add(root);

        int sum = 0;
        while(!queue.isEmpty()){
            int size = queue.size();
            sum = 0;//每次都得重新赋值为0 ， 覆盖上一次的结果
            //list.add(node.val);
            for(int k=0; k< size; k++){
                TreeNode node = queue.poll();
                sum += node.val;
                if(node.left !=null){
                    queue.add(node.left);
                }
                if(node.right !=null){
                    queue.add(node.right);
                }
            }


        }
        return sum;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class SolutionDFS {
    private int maxLevel =0;
    private int sum = 0;

    public int deepestLeavesSum(TreeNode root) {
        //not null check
        if(root == null) return -1;
        dfs(root, 0);
        return sum;


    }
    private void dfs(TreeNode root, int level) {
        if(root == null) return;
        if(level > maxLevel){
            maxLevel = level;
            sum = 0;
        }
        if(level == maxLevel){
            sum+=root.val;
        }
        dfs(root.left, level +1);
        dfs(root.right, level +1);

    }
}