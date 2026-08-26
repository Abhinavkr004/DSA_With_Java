package Trees.BinaryTrees;

import java.util.List;
import java.util.ArrayList;
import java.util.Stack;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(){};
    TreeNode(int val){
        this.val = val;
    }
    TreeNode(int val, TreeNode left, TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

// By Recursion 

// public class Tree_PostOrder_Traversal_Leetcode_145 {
//     public List<Integer> postOrderTraversal(TreeNode root){
//         List<Integer> list = new ArrayList<>();
//         postOrder(root,list);
//         return list;
//     }
//     public void postOrder(TreeNode root, List<Integer> list){
//         if(root == null){
//             return;
//         }
//         postOrder(root.left,list);
//         postOrder(root.right,list);
//         list.add(root.val);
//     }
// }

// TC : O(n);
// SC : O(n) because of auxiliary space

public class Tree_PostOrder_Traversal_Leetcode_145 {
    public static List<Integer> postOrderTraversal(TreeNode root){
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> st1 = new Stack<>();
        Stack<TreeNode> st2 = new Stack<>();
        st1.push(root);
        while(!st1.isEmpty()){
            root = st1.pop();
            st2.push(root);
            if(root.left != null) st1.push(root.left);
            if(root.right != null) st1.push(root.right);
        }
        while(!st2.isEmpty()){
            list.add(st2.peek().val);
            st2.pop();
        }
        return list;
    }
    // TC : O(n);
    // SC : O(n); because using two stacks
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        list = postOrderTraversal(root);
        System.out.println(list);
    }
}

