<<<<<<< HEAD
package com.ucas.tree.dfs;

public class L226 {

}
/**
 * Definition for a binary tree node.
 *
 */
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

class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root == null)return null;
        //swap two element, use the tmp
        TreeNode tmp = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(tmp);
        return root;

    }

=======
package com.ucas.tree.dfs;

public class L226 {

}
/**
 * Definition for a binary tree node.
 *
 */
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

class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root == null)return null;
        //swap two element, use the tmp
        TreeNode tmp = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(tmp);
        return root;

    }

>>>>>>> 076adb1c2b90becfd25d5b18192887e301578bb9
}