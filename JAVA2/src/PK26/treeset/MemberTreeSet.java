package PK26.treeset;

import java.util.Iterator;
import java.util.TreeSet;

import PK26.Member;

public class MemberTreeSet {
	
	//TreeSet 타입의 필드 생성 (인스턴스 변수)
	private TreeSet<Member> treeSet;
	
	
	public MemberTreeSet() {
		treeSet  = new TreeSet<Member>();
	}
	
	public void addMember(Member member) {
		treeSet.add(member);
	}
	
	public boolean removeMember(int memberId) {
		Iterator<Member> ir = treeSet.iterator();	//get(i)을 제공하지 않음
		while(ir.hasNext()) {	//hasNext: 다음 객체 존재 판단하여 진행하는 메소드
			Member member=ir.next();
		int tempId=member.getMemberId();
		if(tempId==memberId) {	//멤버아이디가 매개변수와 일치하면
		treeSet.remove(member);	//해당 멤버를 삭제
			return true;	//true반환
				}
			}
		System.out.println(memberId+"아이디가 존재하지 않습니다.");
			return false;
		}
		public void showAllMember() {
			for(Member member : treeSet) {
				System.out.println(member);
			}System.out.println();
		}
	}