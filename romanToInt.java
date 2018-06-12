package leetcode;

import java.util.IllegalFormatCodePointException;

/*
 * 
 * 
 * 
 * 罗马数字包含以下七种字符：I， V， X， L，C，D 和 M。

字符          数值
I             1
V             5
X             10
L             50
C             100
D             500
M             1000

例如， 罗马数字 2 写做 II ，即为两个并列的 1。12 写做 XII ，即为 X + II 。 27 写做  XXVII, 即为 XX + V + II 。

通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，例如 4 不写做 IIII，而是 IV。数字 1 在数字 5 的左边，所表示的数等于大数 5 减小数 1 得到的数值 4 。同样地，数字 9 表示为 IX。这个特殊的规则只适用于以下六种情况：

    I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
    X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。 
    C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。

给定一个罗马数字，将其转换成整数。输入确保在 1 到 3999 的范围内。

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
