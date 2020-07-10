package PK26.treeset;

import java.util.Iterator;
import java.util.TreeSet;

import PK26.Member;

public class MemberTreeSet {
	
	//TreeSet Ÿ���� �ʵ� ���� (�ν��Ͻ� ����)
	private TreeSet<Member> treeSet;
	
	
	public MemberTreeSet() {
		treeSet  = new TreeSet<Member>();
	}
	
	public void addMember(Member member) {
		treeSet.add(member);
	}
	
	public boolean removeMember(int memberId) {
		Iterator<Member> ir = treeSet.iterator();	//get(i)�� �������� ����
		while(ir.hasNext()) {	//hasNext: ���� ��ü ���� �Ǵ��Ͽ� �����ϴ� �޼ҵ�
			Member member=ir.next();
		int tempId=member.getMemberId();
		if(tempId==memberId) {	//������̵� �Ű������� ��ġ�ϸ�
		treeSet.remove(member);	//�ش� ����� ����
			return true;	//true��ȯ
				}
			}
		System.out.println(memberId+"���̵� �������� �ʽ��ϴ�.");
			return false;
		}
		public void showAllMember() {
			for(Member member : treeSet) {
				System.out.println(member);
			}System.out.println();
		}
	}