package PK23;

import java.util.StringTokenizer;


public class stTokenizer {

	public static void main(String[] args) {
		String str="Have a Nice Day";
		
		/*StringTokenzier
		(�ڸ��� ���� ���ڿ�, �ڸ��� ���ع����� ����, �ڸ��� ������ ������ ����)*/
		
		
		StringTokenizer obj =new StringTokenizer(str," ",false);

// StringTokenizer.hasMoreTokens() - Token���� ����Ǿ� �ִ� �迭
		while(obj.hasMoreTokens()) {
		String t=obj.nextToken();
		System.out.println(t);
		
	}
		
		
		
		
	}
}
