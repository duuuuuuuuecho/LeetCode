package leetcode;
/*
 * ���һ�����ʵĳ���
 * 
 * ����һ����������Сд��ĸ�Ϳո� ' ' ���ַ��������������һ�����ʵĳ��ȡ�

������������һ�����ʣ��뷵�� 0 ��

˵����һ��������ָ����ĸ��ɣ����������κοո���ַ�����

ʾ��:

����: "Hello World"
���: 5


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
