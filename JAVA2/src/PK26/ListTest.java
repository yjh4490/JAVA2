package PK26;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
	public static void main(String[] args) {
		//List������ ���� ArrayListŬ������ ��ü����
		List<String> ls = new ArrayList<String>(); 

		//����Ʈ�� ������ �߰�!
		ls.add("Hi!");
		ls.add(" Have");
		ls.add(" a Nice Day");
		
		for (int i = 0;i < ls.size(); i++) 
			System.out.println(i + ":" + ls.get(i).toString());
		System.out.println();
		
		ls.add(3,"Everybody");
		for (int i = 0;i < ls.size(); i++) 
			System.out.println(i + ":" + ls.get(i).toString());
		System.out.println();
		
		ls.remove(0);
		for (int i = 0;i < ls.size(); i++) 
			System.out.println(i + ":" + ls.get(i).toString());
		System.out.println();
	}
}