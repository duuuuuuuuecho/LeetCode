package leetcode;

import javax.security.auth.x500.X500Principal;

/*搜索插入位置
 * 
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。

你可以假设数组中无重复元素。

示例 1:

输入: [1,3,5,6], 5
输出: 2

示例 2:

输入: [1,3,5,6], 2
输出: 1

示例 3:

输入: [1,3,5,6], 7
输出: 4

示例 4:

输入: [1,3,5,6], 0
输出: 0


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
