package PK26.hashset;

import PK26.Member;

public class MemberHashSetTest {

	public static void main(String[] args) {
		
		MemberHashSet memberHashSet=new MemberHashSet();
		
		Member memberPark=new Member(1003,"�ڼ���");
		Member memberLee=new Member(1001,"������");
		Member memberSon=new Member(1002,"�չα�");
		
		
		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberSon);
		memberHashSet.addMember(memberPark);
		memberHashSet.showAllMember();
		System.out.println("----------------------");
		
		//��ü �߰� (�ߺ����̵�)
		Member memberHong =new Member(1003,"ȫ�浿"); //1003 memberId �ߺ�
		memberHashSet.addMember(memberHong);
		memberHashSet.showAllMember();
		
	}
}/* HashSet�� ���� ���Ǵ��Ͽ� �Է��ϴµ� equals�� hashcode�� ������ ������ ������ �������� �ߺ� ���θ�
�Ǵ��Ҽ��� ��� �ߺ��� ����Ѵ�.*/
//String �Ǵ� Integer���� �̹� JDK���� �����Ͽ��� JVM(�����Ͻ� �۵�)���� �����ϹǷ� �ߺ��� �����
//������ compable�� ���Ͽ� ������ ���־�� �����ϴ�.(String �Ǵ� Integer���� �̹� �Ǿ�����)



