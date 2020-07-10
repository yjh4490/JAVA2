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
		manage.put(name, student[i]);
		}
//==========================출력====================		
	 Set<String>key = manage.keySet();
	Iterator<String> it=key.iterator();
	while(it.hasNext()) {
		String name=it.next();
		System.out.println("----------------------------------");
		Student s=manage.get(name);
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
				Student s=manage.get(name);
				s.find_student(name);
			}
			sc.close();
		
	}
}