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
class Find_Floor_In_A_Binary_Search_Tree {
    public int findFloor(TreeNode root, int key){
        int floor = -1;
        while(root != null){
            if(root.val == key){
                floor = root.val;
                return floor;
            }
            if(key < root.val){
                root = root.left;
            }
            else{
                floor = root.val;
                root = root.right;
            }
        }
        return floor;
    }
    public static void main(String[] args){
        Find_Floor_In_A_Binary_Search_Tree obj = new Find_Floor_In_A_Binary_Search_Tree();
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(6);
        int key = 7;
        int res = obj.findFloor(root,key);
        if(res != -1){
            System.out.println("Found Floor value: " + res);
        }
        else{
            System.out.println("Not Found");
        }
    }
}
