package leetcode;

import javax.print.attribute.standard.OutputDeviceAssigned;

/*
 * ʵ�� strStr() ������

����һ�� haystack �ַ�����һ�� needle �ַ������� haystack �ַ������ҳ� needle �ַ������ֵĵ�һ��λ�� (��0��ʼ)����������ڣ��򷵻�  -1��

ʾ�� 1:

����: haystack = "hello", needle = "ll"
���: 2

ʾ�� 2:

����: haystack = "aaaaa", needle = "bba"
���: -1

 * */

public class strStr {

	public int strStr0(String haystack, String needle){
		if( needle.length() == 0){
			return 0;
		}
		if(haystack.length() == 0 || haystack.length() < needle.length()){
			return -1;
		}
		
		
		char[] x = haystack.toCharArray();
		char[] y = needle.toCharArray();
		int xlen = x.length;
		int ylen = y.length;
		int L ;
		for(int i = 0 ; i <= xlen-ylen ; i++){
			for(int j = 0; j < ylen; j++){
				if(x[i+j] == y[j]){
					if(j == ylen-1){
						return i;
					}
					continue;
				}else{
					break;
				}
				
			}
			
		}
		
		return -1;
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		strStr xStr = new strStr();
		String haystack = "hello";
		String needle = "";
		int x = xStr.strStr0(haystack, needle);
		System.out.println(x);
	}

}
