package leetcode;

import java.util.Arrays;

/*108. ����������ת��Ϊ����������
 * ��һ�������������е��������飬ת��Ϊһ�ø߶�ƽ�������������

�����У�һ���߶�ƽ���������ָһ��������ÿ���ڵ� ���������������ĸ߶Ȳ�ľ���ֵ������ 1��

ʾ��:

������������: [-10,-3,0,5,9],

һ�����ܵĴ��ǣ�[0,-3,9,-10,null,5]�������Ա�ʾ��������߶�ƽ�������������

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
