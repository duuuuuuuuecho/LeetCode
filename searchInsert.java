package leetcode;

import javax.security.auth.x500.X500Principal;

/*��������λ��
 * 
 * ����һ�����������һ��Ŀ��ֵ�����������ҵ�Ŀ��ֵ�������������������Ŀ��ֵ�������������У����������ᱻ��˳������λ�á�

����Լ������������ظ�Ԫ�ء�

ʾ�� 1:

����: [1,3,5,6], 5
���: 2

ʾ�� 2:

����: [1,3,5,6], 2
���: 1

ʾ�� 3:

����: [1,3,5,6], 7
���: 4

ʾ�� 4:

����: [1,3,5,6], 0
���: 0


 * 
 * */
public class searchInsert {

	public int searchInsert0(int[] nums , int target){
		int x = 0;
		int y = nums.length-1;
		System.out.println(x+"x");
		System.out.println(y+"y");
		
		if(target == nums[x] || target < nums[x]){
			return x;
		}
		if(target == nums[y]){
			return y;
		}
		if(target >nums[y]){
			return y+1;
		}
		
		
		
		while((y-x) != 1){
			int mid = (x+y)/2;
			System.out.println(x+"x");
			System.out.println(y+"y");
			System.out.println(mid+"mid");
			
			
			if(target < nums[mid]){
				y = mid;
				System.out.println(y+"y");
			}else if (target > nums[mid]) {
				x = mid;
				System.out.println(x+"x");
			}else{
				return mid;
			}
		}
		
		return y;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		searchInsert xSearchInsert = new searchInsert();
		int[] nums ={1,3,5,6};
		int target = 8;
		
		System.out.println(xSearchInsert.searchInsert0(nums, target));
	}

}
