package PK30.lambda;


interface PrintString{
	
	void showString(String str);
}


public class TestLambda {

	public static void main(String[] args) {
		//  ���ٽ��� ������ ����
		PrintString lambdaStr = a->System.out.println(a);
		lambdaStr.showString("hello lambda_1");
		
		//  �Լ��� ���� ����1 -> �Լ��� ���ٽ��� �� �����ΰ� �־�� ��!!
		showMyString(lambdaStr); 
		//a->System.out.println(a); ����Ǿ� lambdaStr�� �������
		
		//  �Լ��� ���� ����2
		PrintString reStr=returnString();
		reStr.showString("hello");
		
	}
	public static void showMyString(PrintString p) {
		p.showString("hello lambda_2");
	}
	
	public static PrintString returnString() {
		return a->System.out.println(a + " world");
	}
	
	
}
