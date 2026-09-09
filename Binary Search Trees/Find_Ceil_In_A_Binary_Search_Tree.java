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
public class Find_Ceil_In_A_Binary_Search_Tree {
    public int findCeil(TreeNode root, int key){
        int ceil = -1;
        while(root != null){
            if(key == root.val){
                ceil = root.val;
                return ceil;
            }
            if(key > root.val){
                root = root.right;
            }
            else{
                ceil = root.val;
                root = root.left;
            } 
        }
        return ceil;
    }
    public static void main(String[] args){
        Find_Ceil_In_A_Binary_Search_Tree obj = new Find_Ceil_In_A_Binary_Search_Tree();
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(13);
        root.right.left = new TreeNode(11);
        root.right.right = new TreeNode(14);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(6);
        root.left.right.right = new TreeNode(9);
        root.left.left.left = new TreeNode(2);
        root.left.left.right = new TreeNode(4);
        int key = 8;
        int res = obj.findCeil(root,key);
        if(res != -1){
            System.out.println("Ceiling value of key is: " + res);
        }
        else{
            System.out.println("Not Found");
        }
        
    }
}