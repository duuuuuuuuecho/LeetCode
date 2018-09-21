package leetcode;
/*
 * 给定一个二叉树，检查它是否是镜像对称的。
101. 对称二叉树
例如，二叉树 [1,2,2,3,4,4,3] 是对称的。

    1
   / \
  2   2
 / \ / \
3  4 4  3

但是下面这个 [1,2,2,null,3,null,3] 则不是镜像对称的:

    1
   / \
  2   2
   \   \
   3    3

 * 
 * 
 * 
 * */

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class isSymmetric {
	
	 public static class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
	
	
	public boolean isSymmetric(TreeNode left,TreeNode right){
		if(left == null && right == null){
			return true;
		}
		if((left == null && right != null)||(left != null && right == null)){
			return false;
		}
		if(left.val != right.val){
			return false;
		}
		return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
		
		
	}
	
	public boolean isSymmetric(TreeNode root) {
		if(root == null){
			return true;
		}
		return isSymmetric(root.left,root.right); 
    }
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	}

}
