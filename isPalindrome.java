package leetcode;

import java.util.ArrayList;

import javax.swing.text.TabStop;

/*
 * 
 * �ж�һ�������Ƿ��ǻ���������������ָ���򣨴������ң��͵��򣨴������󣩶�����һ����������

ʾ�� 1:

����: 121
���: true

ʾ�� 2:

����: -121
���: false
����: �������Ҷ�, Ϊ -121 �� ���������, Ϊ 121- �����������һ����������

ʾ�� 3:

����: 10
���: false
����: ���������, Ϊ 01 �����������һ����������

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
