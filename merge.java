package leetcode;

/* 88 �ϲ�������������
 * �������������������� nums1 �� nums2���� nums2 �ϲ��� nums1 �У�ʹ�� num1 ��Ϊһ���������顣

˵��:

    ��ʼ�� nums1 �� nums2 ��Ԫ�������ֱ�Ϊ m �� n��
    ����Լ��� nums1 ���㹻�Ŀռ䣨�ռ��С���ڻ���� m + n�������� nums2 �е�Ԫ�ء�

ʾ��:

����:
nums1 = [1,2,3,0,0,0], m = 3
nums2 = [2,5,6],       n = 3

���: [1,2,2,3,5,6]


 * 
 * 
 * */
public class merge {
	
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int[] x = new int[m+n]  ;
		int i = 0,j = 0, k = 0;
		
		while(i < m && j < n){
			if(nums1[i] <= nums2[j]){
				x[k] = nums1[i];
				i++;
				k++;
			}else{
				x[k] = nums2[j];
				j++;
				k++;
			}
		}
		
		while(i < m ){
			x[k++] = nums1[i++];
		}		
		
		while(j < n ){
			x[k++] = nums2[j++];
		}	
		

        System.arraycopy(x,0, nums1,0,x.length); 
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		merge xMerge = new merge();
		int [] nums1 = {1,2,3,0,0,0};
		int [] nums2 = {2,5,6};
		xMerge.merge(nums1, 3, nums2, 3);
		
	}

}
