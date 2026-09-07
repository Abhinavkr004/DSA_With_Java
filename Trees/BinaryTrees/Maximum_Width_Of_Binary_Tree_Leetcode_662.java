package Trees.BinaryTrees;

import java.util.Queue;
import java.util.LinkedList;

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
class pair{
    TreeNode node;
    int val;
    pair(TreeNode node, int val){
        this.node = node;
        this.val = val;
    }
}
public class Maximum_Width_Of_Binary_Tree_Leetcode_662 {
    public static int maxWidthOfBinaryTree(TreeNode root){
        if(root == null){
            return 0;
        }
        int ans = 0;
        Queue<pair> q = new LinkedList<>();
        q.offer(new pair(root,0));
        while(!q.isEmpty()){
            int qSize = q.size();
            //int mimm = q.peek().val;
            int l = 0;
            int r = 0;
            for(int i = 0 ; i < qSize ; i++){
                int cur_id = q.peek().val;
                TreeNode node = q.peek().node;
                if(i == 0) l = cur_id;
                if(i == qSize-1) r = cur_id;
                q.poll();
                if(node.left != null){
                    q.offer(new pair(node.left,cur_id*2+1));
                }
                if(node.right != null){
                    q.offer(new pair(node.right,cur_id*2+2));
                }
            }
            ans = Math.max(ans,r-l+1);
        }
        return ans;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(3);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(3);
        root.right.right = new TreeNode(9);
        int res = maxWidthOfBinaryTree(root);
        System.out.println(res);
    }
}

// TC : O(n)
// SC : O(n)
