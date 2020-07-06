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
		
		//�Ѱ�ü��
		System.out.println("list�� �Ѱ�ü�� �� : " + list.size());
		
		String skill=list.get(2);
		System.out.println("2 : "+ skill);
		
		System.out.println("==========================");
		
		//for -> size, get,
		// �⺻ for��
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
		
		
		//for - each�� Ȱ��
//		for(String L : list) { //  ��ġ�� ���Ϲ��� Ÿ�� : ������ų �迭 
//			System.out.println(L);
//		}
		
		
		
		System.out.println("======= ���� �� ����=======");
		
		//���� remove
		list.remove(2);	// Servlet/JSP ����
		list.remove(2);	// ����� DATABASE ����
		
		// �⺻ for��
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
		
		//for - each�� Ȱ��
//		for(String L : list) { //  ��ġ�� ���Ϲ��� Ÿ�� : ������ų �迭 
//			System.out.println(L);
//		}
		
	}
}