package leetcode;

import java.util.ArrayList;

import javax.swing.text.TabStop;

/*
 * 
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。

示例 1:

输入: 121
输出: true

示例 2:

输入: -121
输出: false
解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。

示例 3:

输入: 10
输出: false
解释: 从右向左读, 为 01 。因此它不是一个回文数。

 * 
 * 
 * 
 * */

public class isPalindrome {
	
    public boolean is_Palindrome(int x) {
        String xString = Integer.toString(x);
        char[] xchar = xString.toCharArray();
        int top = 0;
        int bottom = xchar.length-1;
        
        while(top < bottom){
        	if(xchar[top] == xchar[bottom]){
        		top++;
        		bottom--;
        	}else{
        		return false;
        	}
        }
        return true;
        
    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isPalindrome aIsPalindrome  = new isPalindrome();
		int x = 12321;
		System.out.println(aIsPalindrome.is_Palindrome(x));
		
	}

}
