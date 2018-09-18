package leetcode;


/*83 ɾ�����������е��ظ�Ԫ��
 * 
 * ����һ����������ɾ�������ظ���Ԫ�أ�ʹ��ÿ��Ԫ��ֻ����һ�Ρ�

ʾ�� 1:

����: 1->1->2
���: 1->2

ʾ�� 2:

����: 1->1->2->3->3
���: 1->2->3


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
