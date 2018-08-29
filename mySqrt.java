package leetcode;
/*
 * 69.x��ƽ����
 * 
 * ʵ�� int sqrt(int x) ������

���㲢���� x ��ƽ���������� x �ǷǸ�������

���ڷ������������������ֻ���������Ĳ��֣�С�����ֽ�����ȥ��

ʾ�� 1:

����: 4
���: 2

ʾ�� 2:

����: 8
���: 2
˵��: 8 ��ƽ������ 2.82842..., 
     ���ڷ���������������С�����ֽ�����ȥ��


 * 
 * 
 * */

public class mySqrt {

	public int mySqrt(int x) {
		
		double a = 0.0;
		double b = x+0.25;
		
		while(b-a>0.00001){
			double m = (a+b)/2;
			if(m*m - x > 0){
				b = m;
			}else{
				a = m;
			}
			
		}
		//System.out.println(a);
		//System.out.println(b);
		return (int) b;
		
		
        
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mySqrt xMySqrt =new mySqrt();
		System.out.println(xMySqrt.mySqrt(180));

	}

}
