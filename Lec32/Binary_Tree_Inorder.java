package Lec32;

import java.util.ArrayList;
import java.util.List;

public class Binary_Tree_Inorder {
       class TreeNode {
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
        public List<Integer> inorderTraversal(TreeNode root) {
            List<Integer> ll=new ArrayList<>();
            tree(root,ll);
            return ll;
        }
        public static void tree(TreeNode root,List<Integer>ll){
            if(root==null){
                return;
            }
            tree(root.left,ll);
            ll.add(root.val);
            tree(root.right,ll);
        }
    }
}
