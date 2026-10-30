class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(){}
    TreeNode(int val){
        this.val = val;
    }
    TreeNode(int val,TreeNode left,TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
class LCA_Of_BST_Leetcode_235 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || root == p || root == q || ((root.val > p.val || root.val > q.val) && (root.val < q.val || root.val < p.val))){
            return root;
        }
        if(root.val > p.val && root.val > q.val){
            return lowestCommonAncestor(root.left,p,q);
        }
        else{
            return lowestCommonAncestor(root.right,p,q);
        }
    }
}
// Time Complexity : O(logn)
// Space Complexity : O(1) only using recursion stack space
