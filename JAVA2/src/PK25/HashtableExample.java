package PK25;

import java.util.*;

public class HashtableExample {
	public static void main(String[] args) {
		Map<String, String> map = new Hashtable<>(); 
		
		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");
		
		Scanner Scanner=new Scanner(System.in);
		
		while(true) {
			System.out.println("���̵�� ��й�ȣ�� �Է��ϼ���");
			System.out.println("���̵� : ");
			String id=Scanner.nextLine();
			
			System.out.println("��й�ȣ : ");
			String passward=Scanner.nextLine();
			System.out.println();
			//containsKey : HashMap���� �����ϴ� Key���� Ȯ���ϴ� �޼ҵ�!
			if(map.containsKey(id)) { //�����Ϳ� �ִ� Key�� ���� ��� ����� ��ɾ�!
				if(map.get(id).equals(passward)) {
					System.out.println("�α��� �Ǿ�������.");
					break;
				}
				else {
					System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
					}
				}
				else {
					System.out.println("�Է��Ͻ� ���̵�� �������� �ʽ��ϴ�.");
					}
				}
			
	}
}
