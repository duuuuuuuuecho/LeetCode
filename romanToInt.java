package leetcode;

import java.util.IllegalFormatCodePointException;

/*
 * 
 * 
 * 
 * �������ְ������������ַ���I�� V�� X�� L��C��D �� M��

�ַ�          ��ֵ
I             1
V             5
X             10
L             50
C             100
D             500
M             1000

���磬 �������� 2 д�� II ����Ϊ�������е� 1��12 д�� XII ����Ϊ X + II �� 27 д��  XXVII, ��Ϊ XX + V + II ��

ͨ������£�����������С�������ڴ�����ֵ��ұߡ���Ҳ�������������� 4 ��д�� IIII������ IV������ 1 ������ 5 ����ߣ�����ʾ�������ڴ��� 5 ��С�� 1 �õ�����ֵ 4 ��ͬ���أ����� 9 ��ʾΪ IX���������Ĺ���ֻ�������������������

    I ���Է��� V (5) �� X (10) ����ߣ�����ʾ 4 �� 9��
    X ���Է��� L (50) �� C (100) ����ߣ�����ʾ 40 �� 90�� 
    C ���Է��� D (500) �� M (1000) ����ߣ�����ʾ 400 �� 900��

����һ���������֣�����ת��������������ȷ���� 1 �� 3999 �ķ�Χ�ڡ�

 * 
 * */

public class romanToInt {
	
	public int romantoint(String s) {
		int i = 0;
		char[] ro = s.toCharArray();
		int count = 0;
		for( ; i < ro.length; i++){
			System.out.println(ro[i]);
			switch (ro[i]) {
			
			case 'M': count = count + 1000;break;
			case 'D': count = count + 500;break;
			case 'C':if(i+1 < ro.length){
						if(ro[i+1] == 'D') {count = count + 400;i=i+1;break;}
						else if(ro[i+1] == 'M'){count = count + 900;i=i+1;break;}
						else {count = count + 100;break;}
					}else {count = count + 100;break;}
			
			
			case 'L': count = count + 50;break;
			
			case 'X':if(i+1 < ro.length){
						if(ro[i+1] == 'L') {count = count + 40;i=i+1;break;}
						else if(ro[i+1] == 'C'){count = count + 90;i=i+1;break;}
						else {count = count + 10;break;}
					}else {count = count + 10;break;}
			
			
			case 'V': count = count + 5;break;
			case 'I':if(i+1 < ro.length){
						if(ro[i+1] == 'V') {count = count + 4;i=i+1;break;}
							else if(ro[i+1] == 'X'){count = count + 9;i=i+1;break;}
							else {count = count + 1;break;}
					}else {count = count + 1;break;}
			
			default:
				break;
			}
					
		}
		
		
		
		return count;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		romanToInt aInt = new romanToInt();
		aInt.romantoint("MCMXCIV");
	}

}
