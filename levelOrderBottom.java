package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Collections.*;
import javax.management.Query;

/*
 * 107. 二叉树的层次遍历 II
 * 给定一个二叉树，返回其节点值自底向上的层次遍历。 （即按从叶子节点所在层到根节点所在的层，逐层从左向右遍历）

例如：
给定二叉树 [3,9,20,null,null,15,7],

    3
   / \
  9  20
    /  \
   15   7

返回其自底向上的层次遍历为：

[
  [15,7],
  [9,20],
  [3]
]


 * /**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class levelOrderBottom {
	
	public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
	
	
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
        
        Queue<TreeNode> q = new LinkedList<TreeNode>() ;
        List<List<Integer>> all = new ArrayList<>();
        if(root == null){
        	return all;
        }
        q.add(root);
        
        
        while(q.size() > 0 ){
        	int len = q.size();
        	List aList = new ArrayList<>();
        	TreeNode xNode = null ;
        	for(int i =0 ;i <len; i++){
        		xNode = q.poll();
        		aList.add(xNode.val);
        		if(xNode.left != null) q.add(xNode.left);
        		if(xNode.right != null) q.add(xNode.right);
        	}
        	all.add(aList);
        	
        }
        Collections.reverse(all);
        return all;
        
        
		
		
    }
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
