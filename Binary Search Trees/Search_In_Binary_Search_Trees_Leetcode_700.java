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
class Search_In_Binary_Search_Trees_Leetcode_700 {
    public TreeNode searchBST(TreeNode root, int val){
        while(root != null && root.val != val){
            if(root.val > val){
                root = root.left;
            }
            else{
                root = root.right;
            }
        }
        return root;
    }
    public static void main(String[] args) {
        Search_In_Binary_Search_Trees_Leetcode_700 obj = new Search_In_Binary_Search_Trees_Leetcode_700();
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        int val = 2;
        TreeNode res = obj.searchBST(root,val);
        if(res != null){
            System.out.println("found:" + res.val);
        } else{
            System.out.println("Not Found");
        }
    }
}
