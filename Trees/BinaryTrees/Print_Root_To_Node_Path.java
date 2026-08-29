package Trees.BinaryTrees;

import java.util.ArrayList;

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
public class Print_Root_To_Node_Path {
    public static boolean getPath(TreeNode root, ArrayList<Integer> arr, int x){
        if(root == null){
            return false;
        }
        arr.add(root.val);
        if(root.val == x){
            return true;
        }
        if(getPath(root.left,arr,x) || getPath(root.right,arr,x)){
            return true;
        }
        arr.remove(arr.size()-1);
        return false;
    }
    public static ArrayList<Integer> solve(TreeNode A, int B){
        ArrayList<Integer> arr = new ArrayList<>();
        getPath(A,arr,B);
        return arr;
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.right.left = new TreeNode(6);
        root.left.right.right = new TreeNode(7);
        int x = 7;
        arr = solve(root,x);
        System.out.println(arr);
    }
}
