package leetcode;


import java.awt.print.Printable;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/*
 * ��һ����Сд��ĸ���ɵ��ַ��� S �У�������һЩ��������ͬ�ַ������ɵķ��顣

���磬���ַ��� S = "abbxxxxzyy" �У��ͺ��� "a", "bb", "xxxx", "z" �� "yy" ������һЩ���顣

���ǳ����а������ڻ�������������ַ��ķ���Ϊ�ϴ���顣�ҵ�ÿһ���ϴ�������ʼ����ֹλ�á�

���ս�������ֵ�˳�������

ʾ�� 1:

����: "abbxxxxzzy"
���: [[3,6]]
����: "xxxx" ��һ����ʼ�� 3 ����ֹ�� 6 �Ľϴ���顣

ʾ�� 2:

����: "abc"
���: []
����: "a","b" �� "c" �����Ƿ���Ҫ��Ľϴ���顣

ʾ�� 3:

����: "abcdddeeeeaabbbcd"
���: [[3,5],[6,9],[12,14]]

˵��:  1 <= S.length <= 1000
 * */

public class largeGroupPositions {
	
	private char stackArray[] = new char[1000];
	private int top = -1 ;
	
	
	
	public void push(char x) {
		stackArray[++top] = x ;
	}
	
	public char pop() {
		return stackArray[top--];
		
	}
	
	public boolean isempty() {
		return (top == -1);
	}
	
	public void clear(){
		while(!isempty()){
			pop();
		}
	}
	
	public List<Integer> add_list(int a,int b){
		List<Integer> list_x = new ArrayList<>();
		list_x.add(a);
		list_x.add(b);
		return list_x;
	}
	
	
	public List<List<Integer>> judge(String S) {
		
		char[] x = S.toCharArray();
		
		int x0 = 0;
		int y0 = 0;
		List<List<Integer>> list1 = new ArrayList<>();
		
		if(x.length < 3){return list1;}
		
		for(int i = 0 ; i<x.length; i++){
			if (isempty()){
				push(x[i]);
				x0 = i;
			}else{
				if(x[i] == stackArray[top]){
					push(x[i]);
					if( i == x.length - 1 && top >=2){
						
						list1.add(add_list(x0,i));
					}
					
				}else{
					if (top < 2) {
						clear();
						push(x[i]);
						x0 = i;
					}else{
						y0 = i-1 ;
					
						list1.add(add_list(x0,y0));
						
						clear();
						push(x[i]);
						x0 = i;
					}
				}
			}
		}
		
		return list1;
		
		
		
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		largeGroupPositions aGroupPositions =new largeGroupPositions();
		String xString = "bababbabaa";
		
		System.out.println(aGroupPositions.judge(xString));

	}

}
