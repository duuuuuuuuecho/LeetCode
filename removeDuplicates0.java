package leetcode;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

/*
 * ����һ���������飬����Ҫ��ԭ��ɾ���ظ����ֵ�Ԫ�أ�ʹ��ÿ��Ԫ��ֻ����һ�Σ������Ƴ���������³��ȡ�

��Ҫʹ�ö��������ռ䣬�������ԭ���޸��������鲢��ʹ�� O(1) ����ռ����������ɡ�

ʾ�� 1:

�������� nums = [1,1,2], 

����Ӧ�÷����µĳ��� 2, ����ԭ���� nums ��ǰ����Ԫ�ر��޸�Ϊ 1, 2�� 

�㲻��Ҫ���������г����³��Ⱥ����Ԫ�ء�

ʾ�� 2:

���� nums = [0,0,1,1,1,2,2,3,3,4],

����Ӧ�÷����µĳ��� 5, ����ԭ���� nums ��ǰ���Ԫ�ر��޸�Ϊ 0, 1, 2, 3, 4��

�㲻��Ҫ���������г����³��Ⱥ����Ԫ�ء�

 * 
 * 
 * */

public class removeDuplicates0 {
	
	
	public int removeDuplicates(int[] num){

		if(num == null || num.length == 0 ){
			return 0;
		}else if (num.length == 1) {
			return 1;
		}else {
			int changex = 0;
			int len = 1;
			changex = num[0];
			for(int i = 1 ; i < num.length ; i++){
				if(changex == num[i]){
					continue;
				}
				changex = num[i];
				num[len] = changex;
				len++;
				
			}
			return len;
			
		}
		

		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		removeDuplicates0 xremoveDuplicates0 = new removeDuplicates0();
		
		int[] num = {1,1,2};
		int x = xremoveDuplicates0.removeDuplicates(num);
		System.out.println(x);
		for(int i = 0; i < x ; i++){
			System.out.println(num[i]);
		}
	}

}
