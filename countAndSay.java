package leetcode;

/*
 * 
 * ����
 * ����������ָһ���������У��������е�������˳����б������õ���һ��������ǰ�������£�

1.     1
2.     11
3.     21
4.     1211
5.     111221
6.     312211
7.     13112221

1 ������  "one 1"  ("һ��һ") , �� 11��
11 ������ "two 1s" ("����һ"��, �� 21��
21 ������ "one 2",  "one 1" ��"һ����" ,  "һ��һ") , �� 1211��

����һ�������� n ������������еĵ� n �

ע�⣺����˳�򽫱�ʾΪһ���ַ�����

ʾ�� 1:

����: 1
���: "1"

ʾ�� 2:

����: 4
���: "1211"


 * ��Ŀ�����Ĳ��Ǻ��������ʵ���ǵ�i+1���ַ����ǵ�i���ַ����Ķ�������һ�ַ���Ϊ ��1��

������ĸ��ַ�����1211�����Ķ����� 1��1��1��2,2��1����˵�����ַ�����111221��

������ַ����Ķ����ǣ�3��1��2��2��1��1����˵������ַ�����312211        
 * 
 * */

public class countAndSay {
	
	public String countandsay0(int n){
		if(n == 1){
			return "1";
		}
		if(n == 2){
			return "11";
		}
		
		String pre0 = "11";
		char[] pre = pre0.toCharArray();
		String res = "";
		for(int i = 3;i < n+1 ; i++){
			res = "";
			int cnt = 1; 
			
			int len = pre.length;
			int j = 1;
			
			for(; j < len ; j++){
				if(pre[j-1] == pre[j]){
					cnt+=1;
				}else{
					String iString = String.valueOf(cnt);
					res += iString + pre[j-1];
					cnt = 1;
					
				}
			}
			
			String iString = String.valueOf(cnt);
			res += iString + pre[j-1];
			pre = res.toCharArray();
			
			
		}
		return res;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		countAndSay xCountAndSay = new countAndSay();
		System.out.println(xCountAndSay.countandsay0(6));
		
		
	}

}
