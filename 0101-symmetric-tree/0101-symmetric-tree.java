/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class Solution{
 public boolean isSymmetric(TreeNode root) {

        return findSymmetric(root.left, root.right);
    }

    public boolean findSymmetric(TreeNode root, TreeNode root1) {


        if (root== null && root1== null) {

            return true;
        }

        if ((root != null &&root1 != null) && (root.val == root1.val)) {


            return findSymmetric(root.left, root1.right) && findSymmetric(root.right,root1.left);
        }

        return false;


    }
}


