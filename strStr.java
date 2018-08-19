package leetcode;

import javax.print.attribute.standard.OutputDeviceAssigned;

/*
 * 实现 strStr() 函数。

给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。

示例 1:

输入: haystack = "hello", needle = "ll"
输出: 2

示例 2:

输入: haystack = "aaaaa", needle = "bba"
输出: -1

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
