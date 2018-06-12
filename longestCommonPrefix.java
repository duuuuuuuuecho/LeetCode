package leetcode;



/*编写一个函数来查找字符串数组中的最长公共前缀。

如果不存在公共前缀，返回空字符串 ""。

示例 1:

输入: ["flower","flow","flight"]
输出: "fl"

示例 2:

输入: ["dog","racecar","car"]
输出: ""
解释: 输入不存在公共前缀。
*/
public class longestCommonPrefix {

	
	public String lcp(String[] strs)  {
		
		if (strs.length == 0){
			return "";
		}
		
		if(strs.length == 1){
			return strs[0];
		}
		
		for(int num = 0 ; num < strs.length; num++)
		{
			if (strs[num].isEmpty()){
				return "";
			}
		}
		
		int len = strs[0].length();
		String s = "";
		for(int i = 1 ; i < strs.length ; i++){
			
			if (strs[i].length() < len){
				len = strs[i].length();
			}
		}
			
		
		
		for(int x = 0; x < len ; x++){
		 	for(int j = 0 ; j < strs.length-1 ; j++){
		 		if(strs[j].charAt(x) != strs[j+1].charAt(x)){
		 			return s;
		 		}
		 		if(j+1 == strs.length-1){
		 			s = s + strs[j+1].charAt(x);	
		 		}
		 		
		 	}
		}
		
		
			
		return s;	
	}
		
		
		
		
		
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		longestCommonPrefix aCommonPrefix = new longestCommonPrefix();
		String[] xxxx = {"ac"};
		String xString = aCommonPrefix.lcp(xxxx);
		System.out.println(xString);
	}

}
