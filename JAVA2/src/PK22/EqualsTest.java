package PK22;

public class EqualsTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student(100, "�̻��");
		Student studentLee2 = studentLee;
		Student studentSang = new Student(100, "�̻��");
		
		// ������ �ּ��� �� �ν��Ͻ� ��      
		if(studentLee == studentLee2) 
			System.out.println("�� �񱳴���� �ּҴ� �����ϴ�");
		else 
			System.out.println("�� �񱳴���� �ּҴ� �ٸ��ϴ�");
		
		if(studentLee.equals(studentLee2)) 
			System.out.println("�� �񱳴���� �����ϴ�");
		else 
			System.out.println("�� �񱳴���� �������� �ʴ�");
		
		// �ٸ� �ּҸ� ���� �ִ� ��ü�� ������ ���� ��
			if(studentLee == studentSang) 
				System.out.println("�� �񱳴���� �ּҴ� �����ϴ�");
			else 
				System.out.println("�� �񱳴���� �ּҴ� �ٸ��ϴ�");
			
			if(studentLee.equals(studentSang)) 
				System.out.println("�� �񱳴���� �����ϴ�");
			else 
				System.out.println("�� �񱳴���� �������� �ʴ�");
				
			
				// �ν��Ͻ� ������ ��������� heap �޸� �ּ�
				System.out.println("StudentLee�� hashcode �� : " + studentLee.hashCode());
				System.out.println("StudentSang�� hashcode �� : " + studentSang.hashCode());
				
				// �ν��Ͻ� ���� �־����� ���� �ּ�
				System.out.println("StudentLee�� ���� �ּҰ� : " + System.identityHashCode(studentLee));
				System.out.println("StudentSang�� ���� �ּҰ� : " + System.identityHashCode(studentSang));
				
	}
}

                