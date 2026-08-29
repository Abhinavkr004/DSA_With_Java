package Trees.BinaryTrees;

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
public class Find_Lowest_Common_Ancestor_Of_A_Binary_Tree_Leetcode_236 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){
        if(root == null || root == p || root == q){
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left,p,q);
        TreeNode right = lowestCommonAncestor(root.right,p,q);
        if(left == null){
            return right;
        }
        if(right == null){
            return left;
        }
        else{
            return root;
        }
    }
    public static void main(String[] args) {
        Find_Lowest_Common_Ancestor_Of_A_Binary_Tree_Leetcode_236 obj = new Find_Lowest_Common_Ancestor_Of_A_Binary_Tree_Leetcode_236();
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);
        TreeNode p = root.left;
        TreeNode q = root.right;
        TreeNode ans = obj.lowestCommonAncestor(root,p,q);
        System.out.println(ans.val);
    } 
}

// TC : O(n)
// SC : O(n) because of recursion it is taking auxiliary space