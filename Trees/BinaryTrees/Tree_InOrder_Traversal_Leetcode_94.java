package Trees.BinaryTrees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val){this.val = val;}
    TreeNode(int val, TreeNode left, TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

// Using Recursion 

// class Tree_InOrder_Traversel_Leetcode_94{
//     private void inOrder(TreeNode root, List<Integer> al){
//         if(root == null){
//             return;
//         }
//         inOrder(root.left,al);
//         al.add(root.val);
//         inOrder(root.right,al);
//     }
//     public List<Integer> inorderTraversal(TreeNode root) {
//         List<Integer> result = new ArrayList<>();
//         inOrder(root,result);
//         return result;      
//     }
// }

// TC : O(n)
// SC : O(n) because recursion takes auxiliary space

// Using Loop

class Tree_InOrder_Traversal_Leetcode_94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        while(true){
            if(root != null){
                st.push(root);
                root = root.left;
            }
            else{
                if(st.isEmpty()){
                    break;
                }
                root = st.pop();
                list.add(root.val);
                root = root.right;
            }
        }
        return list;        
    }
}

// TC : O(n)
// SC : O(n) because using stack