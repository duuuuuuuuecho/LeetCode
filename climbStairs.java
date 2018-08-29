package leetcode;

/*쳲���������
 * 70.��¥��
 * ������������¥�ݡ���Ҫ n ������ܵ���¥����

ÿ��������� 1 �� 2 ��̨�ס����ж����ֲ�ͬ�ķ�����������¥���أ�

ע�⣺���� n ��һ����������

ʾ�� 1��

���룺 2
����� 2
���ͣ� �����ַ�����������¥����
1.  1 �� + 1 ��
2.  2 ��

ʾ�� 2��

���룺 3
����� 3
���ͣ� �����ַ�����������¥����
1.  1 �� + 1 �� + 1 ��
2.  1 �� + 2 ��
3.  2 �� + 1 ��


 * 
 * 
 * */
//쳲���������
public class climbStairs {
	
	public static int climbStairs(int n) {
		if(n == 1){
			return 1;
		}
		if(n == 2){
			return 2;
		}
		
		int[] cs = new int[n] ;
		cs[0] = 1;
		cs[1] = 2;
		for(int i = 2;i<n;i++){
			cs[i] = cs[i-1]+cs[i-2];
		}
		return cs[n-1];
				
		
		
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(climbStairs.climbStairs(4));
	}

}
