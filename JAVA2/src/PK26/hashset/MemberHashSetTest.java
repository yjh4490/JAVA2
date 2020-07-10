package PK26.hashset;

import PK26.Member;

public class MemberHashSetTest {

	public static void main(String[] args) {
		
		MemberHashSet memberHashSet=new MemberHashSet();
		
		Member memberPark=new Member(1003,"박서원");
		Member memberLee=new Member(1001,"이지원");
		Member memberSon=new Member(1002,"손민국");
		
		
		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberSon);
		memberHashSet.addMember(memberPark);
		memberHashSet.showAllMember();
		System.out.println("----------------------");
		
		//객체 추가 (중복아이디)
		Member memberHong =new Member(1003,"홍길동"); //1003 memberId 중복
		memberHashSet.addMember(memberHong);
		memberHashSet.showAllMember();
		
	}
}/* HashSet은 값을 비교판단하여 입력하는데 equals와 hashcode를 재정의 해주지 않으면 데이터의 중복 여부를
판단할수가 없어서 중복을 허용한다.*/
//String 또는 Integer등은 이미 JDK에서 재정하였고 JVM(컴파일시 작동)에서 인지하므로 중복이 불허됨
//정렬은 compable를 통하여 재정의 해주어야 가능하다.(String 또는 Integer등은 이미 되어있음)



