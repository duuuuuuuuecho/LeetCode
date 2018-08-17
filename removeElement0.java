package leetcode;


/*����һ������ nums ��һ��ֵ val������Ҫԭ���Ƴ�������ֵ���� val ��Ԫ�أ������Ƴ���������³��ȡ�

��Ҫʹ�ö��������ռ䣬�������ԭ���޸��������鲢��ʹ�� O(1) ����ռ����������ɡ�

Ԫ�ص�˳����Ըı䡣�㲻��Ҫ���������г����³��Ⱥ����Ԫ�ء�

ʾ�� 1:

���� nums = [3,2,2,3], val = 3,

����Ӧ�÷����µĳ��� 2, ���� nums �е�ǰ����Ԫ�ؾ�Ϊ 2��

�㲻��Ҫ���������г����³��Ⱥ����Ԫ�ء�

ʾ�� 2:

���� nums = [0,1,2,2,3,0,4,2], val = 2,

����Ӧ�÷����µĳ��� 5, ���� nums �е�ǰ���Ԫ��Ϊ 0, 1, 3, 0, 4��

ע�������Ԫ�ؿ�Ϊ����˳��

�㲻��Ҫ���������г����³��Ⱥ����Ԫ�ء�

 * 
 * 
 * */

public class removeElement0 {

	public int removeElement(int[] nums,int val){
		if(nums == null || nums.length == 0){
			return 0;
		}else{
		
			int len = 0;
			
			for(int i = 0 ; i < nums.length ; i++){
				if(nums[i] == val){
					continue;
				}
				
				nums[len] = nums[i];
				len++;
			}
			return len;
		}
		
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		removeElement0 xRemoveElement0 = new removeElement0();
		int[] nums = {3,2,2,3};
		int val = 2; 
		int x = xRemoveElement0.removeElement(nums, val);
		System.out.println(x);
		for(int i = 0 ; i < x ; i++){
			System.out.println(nums[i]);
		}
	}

}
