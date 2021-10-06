////Q: 给定一个二叉搜索树(BST)，找到树中第 K 小的节点
//
///**
// * Definition for a binary tree node.
// * public class TreeNode {
// *     int val;
// *     TreeNode left;
// *     TreeNode right;
// *     TreeNode() {}
// *     TreeNode(int val) { this.val = val; }
// *     TreeNode(int val, TreeNode left, TreeNode right) {
// *         this.val = val;
// *         this.left = left;
// *         this.right = right;
// *     }
// * }
// */
//class Solution230 {
//    public int kthSmallest(TreeNode root, int k) {
//
//        Stack<TreeNode> stack = new Stack<>();
//
//        if(root == null) return -1;
//        while(root != null || !stack.empty()){
//            while(root !=null){
//                stack.push(root);
//                root = root.left;
//            }
//            root = stack.pop();
//
//            if(--k == 0) break;
//            root = root.right;
//        }
//        return root.val;
//    }
//}