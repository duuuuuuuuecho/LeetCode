package leetcode;


import java.awt.print.Printable;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/*
 * 在一个由小写字母构成的字符串 S 中，包含由一些连续的相同字符所构成的分组。

例如，在字符串 S = "abbxxxxzyy" 中，就含有 "a", "bb", "xxxx", "z" 和 "yy" 这样的一些分组。

我们称所有包含大于或等于三个连续字符的分组为较大分组。找到每一个较大分组的起始和终止位置。

最终结果按照字典顺序输出。

示例 1:

输入: "abbxxxxzzy"
输出: [[3,6]]
解释: "xxxx" 是一个起始于 3 且终止于 6 的较大分组。

示例 2:

输入: "abc"
输出: []
解释: "a","b" 和 "c" 均不是符合要求的较大分组。

示例 3:

输入: "abcdddeeeeaabbbcd"
输出: [[3,5],[6,9],[12,14]]

说明:  1 <= S.length <= 1000
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
