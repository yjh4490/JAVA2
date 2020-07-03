package PK23;

public class StringBuilderTest {

	public static void main(String[] args) {
		// immutable(�Һ�)
		String javaStr = new String("java");
		
		//ó�� ��ü�� �ν��Ͻ�  �޷θ� ��
		System.out.println("javaStr�� ���ڿ� �ּ� : " + System.identityHashCode(javaStr));
		
		//String���κ��� StringBuilder�� ��ü�� ����
		StringBuilder buffer = new StringBuilder(javaStr);
		
		//������ �̷������ �� ���� hash��
		System.out.println("���� �� Buffer�� �޷θ� �ּ� : " + System.identityHashCode(buffer));
		
		//�����ϱ�
		buffer.append(" and");
		buffer.append("android");
		buffer.append(" programming is fun!");
		
		//������
		System.out.println("���� �� Buffer�� �޷θ� �ּ� : " + System.identityHashCode(buffer));
		
		javaStr=buffer.toString();
		System.out.println(javaStr);
		System.out.println("���� ������� javaStr�� ���ڿ� �ּ� : " + System.identityHashCode(javaStr));
	}
}