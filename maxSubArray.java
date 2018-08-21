package leetcode;

/*
 * ��������
 * ����һ���������� nums ���ҵ�һ���������͵����������飨���������ٰ���һ��Ԫ�أ������������͡�

ʾ��:

����: [-2,1,-3,4,-1,2,1,-5,4],
���: 6
����: ���������� [4,-1,2,1] �ĺ����Ϊ 6��

 * */

/*
 * ��̬�滮
 * 
 * ʵ������ sum[i] = max (sum[i-1]+a[i],a[i])
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
