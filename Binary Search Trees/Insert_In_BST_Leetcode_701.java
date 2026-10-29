class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(){}
    TreeNode(int val){
        this.val = val;
    }
    TreeNode(int val, TreeNode left, TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
class Insert_In_BST_Leetcode_701 {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null){
            TreeNode data = new TreeNode(val);
            return data;
        }
        TreeNode curr = root;
        while(curr != null){
            if(curr.left == null && curr.val > val){
                TreeNode data = new TreeNode(val);
                curr.left = data;
                return root; 
            }
            if(curr.right == null && curr.val < val){
                TreeNode data = new TreeNode(val);
                curr.right = data;
                return root; 
            }
            if(curr.val < val){
                curr = curr.right;
            }
            else{
                curr = curr.left;
            }
        }
        return root;
    }
}

// Time Complexity : O(logn)
// Space Complexity : O(1)
