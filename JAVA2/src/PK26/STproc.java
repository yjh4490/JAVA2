package PK26;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class STproc {

	public static void main(String[] args) {
		//array
		Student[] student=new Student[4]; // fixed-length
		ArrayList<Student> manage=new ArrayList<Student>();
		//======================입력======================
		Scanner sc=new Scanner(System.in);
		System.out.println("학생 이름, 학과, 학번, 학점편균 입력하세요 : ");
		for(int i=0; i< student.length; i++) {
			System.out.print(">>");
			//입력
		String text=sc.nextLine();
		StringTokenizer St =new StringTokenizer(text,",");
		String name= St.nextToken().trim();
		String department= St.nextToken().trim();
		String number= St.nextToken().trim();
		Double grade= Double.parseDouble(St.nextToken().trim());	//trim()은 공백으로 인해서 오류나지 않게 예방!
		//fixed-length 받고
		student[i] = new Student(name, department, number, grade);
		//Array(student) --> ArrayList(manage)
		manage.add(student[i]);
		}
//==========================출력====================		
	for(int i=0; i<manage.size(); i++) {
		System.out.println("----------------------------------");
		Student s=manage.get(i);
		System.out.println("이름 : " + s.getName());
		System.out.println("학과 : " + s.getDepartment());
		System.out.println("학번 : " + s.getNumber());
		System.out.println("학점평균 : " + s.getGrade());
		}
		System.out.println("----------------------------------");
		while(true) { 
			System.out.println("학생 이름 >> ");
			String name = sc.next();
			if(name.equals("그만"))
				break;
			for(int i=0; i<manage.size(); i++) {
				Student s=manage.get(i);
				s.find_student(name);
			}
		}
		sc.close();
		
	}
}