package leetcode;
/*
 * 最后一个单词的长度
 * 
 * 给定一个仅包含大小写字母和空格 ' ' 的字符串，返回其最后一个单词的长度。

如果不存在最后一个单词，请返回 0 。

说明：一个单词是指由字母组成，但不包含任何空格的字符串。

示例:

输入: "Hello World"
输出: 5


 * 
 * */

public class LengthofLastWord {
	
	
	public int LengthofLastWord0(String s){
		
		String[] xStrings = s.split(" ");
		System.out.println(xStrings.length);
		if (xStrings.length == 0){
			return 0;
		}
		String ss = xStrings[xStrings.length - 1];
		char[] cs = ss.toCharArray();
		return cs.length;
		
	
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LengthofLastWord xLastWord = new LengthofLastWord();
		String s = "we";
		int a = xLastWord.LengthofLastWord0(s);
		System.out.println(a);

	}

}
