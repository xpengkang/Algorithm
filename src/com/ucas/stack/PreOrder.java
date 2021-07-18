package com.ucas.stack;

import javax.swing.tree.TreeNode;
import java.util.Stack;

public class PreOrder {



//    public void preOrder(TreeNode root){
//        if(root != null){
//            Stack<TreeNode> stack = new Stack<>();
//            stack.add(root);
//            //while 做迭代，结束条件栈为空
//            while(!stack.isEmpty()){
//                root = stack.pop();
//                if(root != null){
//                    System.out.println(root.val);//做操作
//                    stack.push(root.right);
//                    stack.push(root.left);
//
//                }
//
//            }
//        }
//    }
//    public void inOrder(TreeNode root){
//        if (root != null){
//            Stack<TreeNode> stack = new Stack<>();
////            stack.add(root);
//            while(!stack.isEmpty() || root != null){
//
//                if(root != null){
//                    stack.push(root);
//                    root = root.left;//用root 迭代变量
//                }else{
//                    root = stack.pop();
//                    System.out.println(root);
//                    root = root.right;
//
//                }
//
//
//
//            }
//        }
//    }
//

}
