package PK26;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class STproc {

	public static void main(String[] args) {
		//array
		Student[] student=new Student[4]; // fixed-length
		ArrayList<Student> manage=new ArrayList<Student>();
		//======================�Է�======================
		Scanner sc=new Scanner(System.in);
		System.out.println("�л� �̸�, �а�, �й�, ������� �Է��ϼ��� : ");
		for(int i=0; i< student.length; i++) {
			System.out.print(">>");
			//�Է�
		String text=sc.nextLine();
		StringTokenizer St =new StringTokenizer(text,",");
		String name= St.nextToken().trim();
		String department= St.nextToken().trim();
		String number= St.nextToken().trim();
		Double grade= Double.parseDouble(St.nextToken().trim());	//trim()�� �������� ���ؼ� �������� �ʰ� ����!
		//fixed-length �ް�
		student[i] = new Student(name, department, number, grade);
		//Array(student) --> ArrayList(manage)
		manage.add(student[i]);
		}
//==========================���====================		
	for(int i=0; i<manage.size(); i++) {
		System.out.println("----------------------------------");
		Student s=manage.get(i);
		System.out.println("�̸� : " + s.getName());
		System.out.println("�а� : " + s.getDepartment());
		System.out.println("�й� : " + s.getNumber());
		System.out.println("������� : " + s.getGrade());
		}
		System.out.println("----------------------------------");
		while(true) { 
			System.out.println("�л� �̸� >> ");
			String name = sc.next();
			if(name.equals("�׸�"))
				break;
			for(int i=0; i<manage.size(); i++) {
				Student s=manage.get(i);
				s.find_student(name);
			}
		}
		sc.close();
		
	}
}