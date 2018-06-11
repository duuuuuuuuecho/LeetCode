package leetcode;


/*
 * 
 * 给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。你可以假设每个输入只对应一种答案，且同样的元素不能被重复利用。
 * 
 * 
 * 给定 nums = [2, 7, 11, 15], target = 9 
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 * 
 * 
 * */

public class twoSum {
			
	
	public int[] twoSums(int[] nums,int target){
		
		int[] a;
		a = new int[2];
 		for(int i = 0; i < nums.length-1 ;i++){
 			
			for(int j = i + 1; j < nums.length ; j++){
				
				if (nums[i] + nums[j] == target){
					a[0] = i;
					a[1] = j;
					return a;	
				} 
				
			}
			
			
		}
 		return a;
		
	}
 	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {2, 3, 8, 4};
		int target = 7;			
		twoSum aSum = new twoSum();
		int[] b ;
		b = new int[2];
 		b = aSum.twoSums(nums,target);
		
		
	}

}
