package leetcode;
/*
 * �ϲ�������������
 * ��������������ϲ�Ϊһ���µ������������ء���������ͨ��ƴ�Ӹ�����������������нڵ���ɵġ� 

ʾ����

���룺1->2->4, 1->3->4
�����1->1->2->3->4->4

 * */

import java.awt.List;

public class mergeTwoLists {
	
	public class ListNode {
	    int val;
	    ListNode next;
	    ListNode(int x) { val = x; }
	}
	
	
	public ListNode mergeTwoLists0(ListNode l1, ListNode l2) {
		if(l1 == null){
			return l2;
		}
		if(l2 == null){
			return l1;
		}
		ListNode xListNode = null ;
		if(l1.val > l2.val){
			xListNode = l2;
			xListNode.next = mergeTwoLists0(l1,l2.next);
			
		}else{
			xListNode = l1;
			xListNode.next = mergeTwoLists0(l2,l1.next);
			
		}
		return xListNode;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
