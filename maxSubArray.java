package leetcode;

/*
 * 最大子序和
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。

示例:

输入: [-2,1,-3,4,-1,2,1,-5,4],
输出: 6
解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。

 * */

/*
 * 动态规划
 * 
 * 实际上求 sum[i] = max (sum[i-1]+a[i],a[i])
 * 
 * 
 * 
 * */
public class maxSubArray {

	public static int maxSubArray0(int [] nums){
		int sum = nums[0];
		int n = nums[0];
		for(int i = 1 ;i < nums.length ; i++){
			if (n > 0 ){
				n = n +nums[i];
			}else{
				n = nums[i];
			}
			if(sum < n){
				sum = n;
			}
			
			
			
		}
		
		return sum;
		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] x = {-2,1,-3,4,-1,2,1,-5,4};
        int x0 = maxSubArray.maxSubArray0(x);
        System.out.println(x0);
	}

}
