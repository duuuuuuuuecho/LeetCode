package leetcode;

import java.math.BigInteger;
import java.sql.DatabaseMetaData;

import org.omg.CORBA.LongLongSeqHelper;

/*
 * ��һ
 * 
 * ����һ����������ɵķǿ���������ʾ�ķǸ��������ڸ����Ļ����ϼ�һ��

���λ���ִ�����������λ�� ������ÿ��Ԫ��ֻ�洢һ�����֡�

����Լ���������� 0 ֮�⣬��������������㿪ͷ��

ʾ�� 1:

����: [1,2,3]
���: [1,2,4]
����: ���������ʾ���� 123��

ʾ�� 2:

����: [4,3,2,1]
���: [4,3,2,2]
����: ���������ʾ���� 4321��


 * 
 * 
 * 
 * */
public class plusOne {
	
	
	
	public int[] plusOne0(int[] digits){
		int n = digits.length;
        for (int i = digits.length - 1; i >= 0; --i) {
            if (digits[i] < 9) {
                ++digits[i];
                return digits;
            }
            digits[i] = 0;
        }
        int[] res = new int[n + 1];
        res[0] = 1;
        return res;
    
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		plusOne xPlusOne = new plusOne();
		int[] digits = {7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6};
		
		int[] x = xPlusOne.plusOne0(digits);
		for(int i = 0; i < x.length ; i++){
			System.out.println(x[i]);
		}
	}

}
