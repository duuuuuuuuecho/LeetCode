package leetcode;

import java.awt.TexturePaint;

/*
 * 
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。

有效字符串需满足：

    左括号必须用相同类型的右括号闭合。
    左括号必须以正确的顺序闭合。

注意空字符串可被认为是有效字符串。
 * 
 * 
 * 
 * 
 * 
 * */



public class isValid {
	
	private char stackArray[] = new char[100];
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
	
	
	public boolean isvalid(String s) {
		if (s =="") {return false;}
		char[] x = s.toCharArray();
		for(int i = 0 ; i < x.length ; i++){
			if (isempty() || x[i]=='(' || x[i]=='[' || x[i]=='{'){
				push(x[i]);
			}else{
				if ((x[i] == ')' && stackArray[top] == '(')||(stackArray[top] == '[' && x[i] == ']')||(stackArray[top] == '{' && x[i] == '}')){
					pop();
				}else{
					push(x[i]);
					
				}
				
				
			}
		}
			
		if (isempty()){
				return true;
			}
		else{
				return false;
			}
			
}
		

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isValid x = new isValid();
		System.out.println(x.isvalid("{[]}"));
		
	}

}
