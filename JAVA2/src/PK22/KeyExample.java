package PK22;

import java.util.HashMap;

public class KeyExample {

	public static void main(String[] args) {

		// Key ��ü�� �ĺ�Ű�� �Ͽ� String ���� �����ϴ� HashMap ��ü ����
		HashMap<Key, String> hashmap = new HashMap<Key,String>();
		
		
		// �ĺ�Ű(HashCode)�� put ���� �Է�
		hashmap.put(new Key(1), "ȫ�浿");
		hashmap.put(new Key(1), "����Ʈ����");
		hashmap.put(new Key(1), "100");
		hashmap.put(new Key(1), "3.9");
		
		
		// �ĺ�Ű(hashcode)�� �̿��Ͽ� ��(String)�� �о��
		String value = hashmap.get(new Key(1));
		System.out.println(value);
		
	}
}

