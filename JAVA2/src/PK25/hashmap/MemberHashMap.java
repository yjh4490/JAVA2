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
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	public void showAllmember() {
		//keySet() : key값만 저장하고 있는 메소드
		Iterator<Integer> ir = hashMap.keySet().iterator(); // 순회하면서 Key들만 가져옴1
		while(ir.hasNext()) { //다음 데이터 있는지 물어보는 명령어!
			int key=ir.next(); // key 저장
			Member member = hashMap.get(key); // 그 key들을 가져와라,키꺼내오기
			System.out.println(member);
			}
			System.out.println();
		}
	
	
	
	
	
}
