package leetcode;


/*83 删除排序链表中的重复元素
 * 
 * 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。

示例 1:

输入: 1->1->2
输出: 1->2

示例 2:

输入: 1->1->2->3->3
输出: 1->2->3


 * 
 * 
 * 
 * 
 * 
 * */
public class deleteDuplicates {

	
	 //Definition for singly-linked list.
	 public class ListNode {
	     int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	  }
	 
	
	public ListNode deleteDuplicates(ListNode head) {
		if(head == null){
			return head;
		}
		
		ListNode aNode ;
		ListNode xNode ;
		ListNode yNode ; 
		
		yNode = head;
		xNode = yNode ;
		int i = 0 ;
		i = yNode.val;
		aNode = xNode;
		while(yNode.next != null){
			yNode = yNode.next;
			if(yNode.val != i){
				i = yNode.val;
				xNode.next = yNode;
				xNode = xNode.next;
				
			}else{
				xNode.next=null;
				continue;
				
			}
			
		}
	
		
		return aNode;
	        
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
