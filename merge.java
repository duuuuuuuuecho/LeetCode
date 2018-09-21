package leetcode;

/* 88 合并两个有序数组
 * 给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。

说明:

    初始化 nums1 和 nums2 的元素数量分别为 m 和 n。
    你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。

示例:

输入:
nums1 = [1,2,3,0,0,0], m = 3
nums2 = [2,5,6],       n = 3

输出: [1,2,2,3,5,6]


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
