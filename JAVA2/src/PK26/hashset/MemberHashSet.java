package PK26.hashset;

import java.util.HashSet;
import java.util.Iterator;

import PK26.Member;

public class MemberHashSet {
	//static -> data������ �� -> ����� ������
	//���������� ���ø޸𸮿� ���̰� -> ����ϸ� �����	
	//�ν��Ͻ����� ->heap�޸𸮿��� ���� �����ϰ� ����
	
	 
	private HashSet<Member> hashSet;
	
	//������ overriding�� ���ؼ� HashSet�� ��ü����
	public MemberHashSet() { 
		hashSet = new HashSet<Member>(); // MemberHashSet�� ����ɶ� ���� ����ǰ� �ʱ�ȭ
	}
	//hashSet�� ��ü �߰�
	public void addMember(Member member) {
		hashSet.add(member);
	}
	//HashSet���� get�� �������� ���� �׷��Ƿ� ��ȸ�ϴ� Iterator�� ���Ͽ� ���� �� �Ǵ��ؾ���
		public boolean removeMember(int memberId) {
		Iterator<Member> ir = hashSet.iterator();	//get(i)�� �������� ����
		while(ir.hasNext()) {	//hasNext: ���� ��ü ���� �Ǵ��Ͽ� �����ϴ� �޼ҵ�
			Member member=ir.next();
		int tempId=member.getMemberId();
		if(tempId==memberId) {	//������̵� �Ű������� ��ġ�ϸ�
		hashSet.remove(member);	//�ش� ����� ����
			return true;	//true��ȯ
				}
			}
		System.out.println(memberId+"���̵� �������� �ʽ��ϴ�.");
			return false;
		}
		public void showAllMember() {
			for(Member member : hashSet) {
				System.out.println(member);
			}System.out.println();
		}
	}