package PK22;

public class StringEqualsExample {

	public static void main(String[] args) {
		String strvar1 = new String("��ȣ��");		
		String strvar2 = "��ȣ��";		
		
		// ������ ���Ǵ�
		if(strvar1 == strvar2) {
			System.out.println("���� String ��ü�� �����ϰ� �ֱ�����~");
		}
		else {
			System.out.println("�ٸ� String ��ü�� �����ϰ� �ֱ�����~");
		}
		
		// ���� ���Ǵ�(equals �������!)
		if(strvar1.equals(strvar2)) {
			System.out.println("���� String ��ü�� �����ϰ� �ֱ�����~");
		}
		else {
			System.out.println("�ٸ� String ��ü�� �����ϰ� �ֱ�����~");
		}
		
		
		
	}

}
