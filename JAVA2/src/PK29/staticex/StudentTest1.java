package PK29.staticex;

public class StudentTest1 {
	public static void main(String[] args) {

		Student studentLee=new Student();
		studentLee.setStudentName("������");
		//System.out.println(studentLee.serialNum); // Student���� ������ �ø���ѹ� �ʱ갪 ���(1000)
		//studentLee.serialNum++; // �ø��� �ѹ� ����� ���� ���� �߰���Ű��!
		System.out.println("���� : " + studentLee.studentName + "�й�: " + studentLee.studentID);
		
		//static�� set�޼ҵ� �Ǵ� ������ �ָ� �ȵȴ�!!!(��, static���� static���� �޾������� ����)
		//System.out.println(Student.setSerialNum(1005));
		System.out.println(Student.getSerialNum());
		
		Student studentSon=new Student();
		studentSon.setStudentName("�ռ���");
		//System.out.println(studentSon.serialNum); // Student���� ������ �ʱ갪 ���
		System.out.println("���� : " + studentSon.studentName + "�й�: " + studentSon.studentID);
		
		
	}
}