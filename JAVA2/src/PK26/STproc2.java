package PK26;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class STproc2 {

	public static void main(String[] args) {
		//array
		Student[] student=new Student[4]; // fixed-length
		HashMap<String, Student> manage= new HashMap<String, Student>();
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
		manage.put(name, student[i]);
		}
//==========================���====================		
	 Set<String>key = manage.keySet();
	Iterator<String> it=key.iterator();
	while(it.hasNext()) {
		String name=it.next();
		System.out.println("----------------------------------");
		Student s=manage.get(name);
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
				Student s=manage.get(name);
				s.find_student(name);
			}
			sc.close();
		
	}
}