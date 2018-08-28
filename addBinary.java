package leetcode;

import java.awt.List;
import java.util.ArrayList;

/*
 * 67.���������
 * 
 * ���������������ַ������������ǵĺͣ��ö����Ʊ�ʾ����

����Ϊ�ǿ��ַ�����ֻ�������� 1 �� 0��

ʾ�� 1:

����: a = "11", b = "1"
���: "100"

ʾ�� 2:

����: a = "1010", b = "1011"
���: "10101"


 * 
 * */
public class addBinary {
	
	public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        
        int a_len = a.length()-1;
        int b_len = b.length()-1;
        int count = 0; //��λ
        
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
