package Lec34;

public class Binary_Search_Tree_to_Greater_Sum_Tree {
      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode() {}
          TreeNode(int val) { this.val = val; }
          TreeNode(int val, TreeNode left, TreeNode right) {
              this.val = val;
              this.left = left;
              this.right = right;
          }
      }
    class Solution {
        public TreeNode bstToGst(TreeNode root) {
            int sum[]={0};
            return  Gst(root,sum);
        }
        public TreeNode Gst(TreeNode root,int sum[]){
            if(root==null){
                return null;
            }
            Gst(root.right,sum);
            root.val=sum[0]+root.val;
            sum[0] = root.val;
            Gst(root.left,sum);
            return root;
        }
    }
}
