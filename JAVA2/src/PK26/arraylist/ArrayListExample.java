package PK26.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add("DATABASE");
		list.add("Spring");
		
		//총객체수
		System.out.println("list의 총객체의 수 : " + list.size());
		
		String skill=list.get(2);
		System.out.println("2 : "+ skill);
		
		System.out.println("==========================");
		
		//for -> size, get,
		// 기본 for문
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
		
		
		//for - each문 활용
//		for(String L : list) { //  수치를 리턴받을 타입 : 참조시킬 배열 
//			System.out.println(L);
//		}
		
		
		
		System.out.println("======= 삭제 후 갯수=======");
		
		//삭제 remove
		list.remove(2);	// Servlet/JSP 삭제
		list.remove(2);	// 당겨진 DATABASE 삭제
		
		// 기본 for문
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
		
		//for - each문 활용
//		for(String L : list) { //  수치를 리턴받을 타입 : 참조시킬 배열 
//			System.out.println(L);
//		}
		
	}
}