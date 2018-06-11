package leetcode;



/*
 * 
 * 
 * 给定一个 32 位有符号整数，将整数中的数字进行反转。

示例 1:

输入: 123
输出: 321

 示例 2:

输入: -123
输出: -321

示例 3:

输入: 120
输出: 21

 * 假设只能存储 32 位有符号整数，其数值范围是 [−2^31,  2^31 − 1]。根据这个假设，如果反转后的整数溢出，则返回 0。
 * 
 * 
 * */



public class reverse {
	
	public int reverse1(int x) {
		
		long y = 0;
		
		if(x > 0){
			while( x != 0)
			{
				y = y * 10 + x % 10;
				x = x / 10;
				
			}
			
		
		}else{
			x = x * (-1);
			while( x != 0)
			{
				y = y * 10 + x % 10;
				x = x / 10;
			}
			
			
			
			
			y  = y * (-1);
			
		}
		if(y > Integer.MAX_VALUE || y < Integer.MIN_VALUE)
			return 0;
		
		return (int)y;
	
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverse aa = new reverse();
		int a = aa.reverse1(-1534236469);
		System.out.println(a);
		//2147483647
		//1534236469
		
		
	}

}
