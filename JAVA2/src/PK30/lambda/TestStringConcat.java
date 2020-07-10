package PK30.lambda;

public class TestStringConcat {

	public static void main(String[] args) {

		String s1="Hello";
		String s2="world";
	
		// ��ü������
		StringConcatImpl str = new StringConcatImpl();
		str.makeString("��ü���� ��� : " + s1, s2);
		
		// ���ٽ�(������ ����)
		StringConcat concat2=(r,v)->System.out.println(r+" "+v);
		concat2.makeString("���ٽ� ��� : " + s1, s2);
		
		
		
		// �͸��� Ŭ����
		StringConcat concat3=new StringConcat() {
			
			@Override
			public void makeString(String s1, String s2) {
				System.out.println("�͸���Ŭ���� : "+s1+" "+s2);
			}
		};
			concat3.makeString(s1,s2);
		
	}
}