package leetcode;

import java.util.Arrays;

/*108. 将有序数组转换为二叉搜索树
 * 将一个按照升序排列的有序数组，转换为一棵高度平衡二叉搜索树。

本题中，一个高度平衡二叉树是指一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1。

示例:

给定有序数组: [-10,-3,0,5,9],

一个可能的答案是：[0,-3,9,-10,null,5]，它可以表示下面这个高度平衡二叉搜索树：

      0
     / \
   -3   9
   /   /
 -10  5


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


public class sortedArrayToBST {

	
	public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
	
	
	 public TreeNode sortedArrayToBST(int[] nums) {
		 if (nums.length ==0 ){
			 return null;
			 
		 } 
	        int mid = nums.length / 2;
	        int[] leftnums;
	        int[] rightnums;
	        leftnums = Arrays.copyOfRange(nums, 0, mid);
	        rightnums = Arrays.copyOfRange(nums, mid+1,nums.length);
	        
	        TreeNode xNode = new TreeNode(nums[mid]);
	        xNode.left = sortedArrayToBST(leftnums);
	        xNode.right = sortedArrayToBST(rightnums);
	        return xNode;
		 
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
