package Trees.BinaryTrees;

import java.util.List;
import java.util.Stack;
import java.util.ArrayList;

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
// Using Recursion Below

// class Tree_PreOrder_Traversel_Leetcode_144 {
//     private void preOrder(TreeNode root, List<Integer> al){
//         if(root == null){
//             return;
//         }
//         al.add(root.val);
//         preOrder(root.left,al);
//         preOrder(root.right,al);
//     }
//     public List<Integer> preorderTraversal(TreeNode root) {
//         List<Integer> list = new ArrayList<>();
//         preOrder(root,list);
//         return list;
//     }
// }

// TC : O(n)
// SC : O(n) by recursion(auxiliary space)

// Using Loop Below

class Tree_PreOrder_Traversel_Leetcode_144{
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null) return list;
        Stack<TreeNode> st = new Stack<>();
        st.push(root);
        while(!st.isEmpty()){
            root = st.pop();
            if(root.right != null) st.push(root.right);
            if(root.left != null) st.push(root.left);
            list.add(root.val);
        }
        return list;
    }
}

// TC : O(n)
// SC : O(n) by using Stack data Structure