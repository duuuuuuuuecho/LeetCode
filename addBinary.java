package leetcode;

import java.awt.List;
import java.util.ArrayList;

/*
 * 67.二进制求和
 * 
 * 给定两个二进制字符串，返回他们的和（用二进制表示）。

输入为非空字符串且只包含数字 1 和 0。

示例 1:

输入: a = "11", b = "1"
输出: "100"

示例 2:

输入: a = "1010", b = "1011"
输出: "10101"


 * 
 * */
public class addBinary {
	
	public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        
        int a_len = a.length()-1;
        int b_len = b.length()-1;
        int count = 0; //进位
        
        while(a_len >= 0 || b_len >= 0){
        	int sum  = count;
        	
        	if(a_len >= 0){
        		sum += a.charAt(a_len) - '0';
        		a_len--;
        	}
        	if(b_len >= 0){
        		sum += b.charAt(b_len) - '0';
        		b_len--;
        	}
        	result.append(sum%2);
        	count = sum/2;
        }
        if(count != 0){
        	result.append(1);
        }
        return result.reverse().toString();
        
        
        
	}
		
		
		
		
		
		
    
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addBinary xaddBinary = new addBinary();
		String a = "100";
		String b = "11";
		System.out.println(xaddBinary.addBinary(a, b));
	}

}
