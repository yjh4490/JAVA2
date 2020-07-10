package PK25.hashmap;

import java.util.HashMap;
import java.util.Iterator;

import PK26.Member;

public class MemberHashMap {

	private HashMap<Integer, Member> hashMap;
	//construct
	public MemberHashMap() {
		hashMap = new HashMap<Integer, Member>();
	}
	
	public void addMember(Member member) {
		hashMap.put(member.getMemberId(), member);
	}
	public boolean removeMember(int memberId) {
		if(hashMap.containsKey(memberId)) {
			hashMap.remove(memberId);
			return true;
		}else
		System.out.println(memberId + "�� �������� �ʽ��ϴ�.");
		return false;
	}
	public void showAllmember() {
		//keySet() : key���� �����ϰ� �ִ� �޼ҵ�
		Iterator<Integer> ir = hashMap.keySet().iterator(); // ��ȸ�ϸ鼭 Key�鸸 ������1
		while(ir.hasNext()) { //���� ������ �ִ��� ����� ��ɾ�!
			int key=ir.next(); // key ����
			Member member = hashMap.get(key); // �� key���� �����Ͷ�,Ű��������
			System.out.println(member);
			}
			System.out.println();
		}
	
	
	
	
	
}
