package Trees.BinaryTrees;

class TreeNode {
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
public class Same_Tree_Leetcode_100 {
    public boolean isSameTree(TreeNode p, TreeNode q){
        if(p == null && q == null){
            return true;
        }
        if(p == null || q == null){
            return false;
        }
        if(p.val != q.val){
            return false;
        }
        boolean lans = isSameTree(p.left, q.left);
        boolean rans = isSameTree(p.right, q.right);
        return lans && rans;
    }
    public static void main(String[] args) {
        Same_Tree_Leetcode_100 obj = new Same_Tree_Leetcode_100();
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);
        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(2);
        q.right = new TreeNode(3);
        System.out.println(obj.isSameTree(p, q));
    }
}

// TC : O(n)
// SC : O(n) beacuse recursion is taking auxiliary space here