package PK22;

public class EqualsTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student(100, "이상원");
		Student studentLee2 = studentLee;
		Student studentSang = new Student(100, "이상원");
		
		// 동일한 주소의 두 인스턴스 비교      
		if(studentLee == studentLee2) 
			System.out.println("두 비교대상의 주소는 같습니다");
		else 
			System.out.println("두 비교대상의 주소는 다릅니다");
		
		if(studentLee.equals(studentLee2)) 
			System.out.println("두 비교대상은 동일하다");
		else 
			System.out.println("두 비교대상은 동일하지 않다");
		
		// 다른 주소를 갖고 있는 객체의 물리적 논리적 비교
			if(studentLee == studentSang) 
				System.out.println("두 비교대상의 주소는 같습니다");
			else 
				System.out.println("두 비교대상의 주소는 다릅니다");
			
			if(studentLee.equals(studentSang)) 
				System.out.println("두 비교대상은 동일하다");
			else 
				System.out.println("두 비교대상은 동일하지 않다");
				
			
				// 인스턴스 생성시 만들어지는 heap 메모리 주소
				System.out.println("StudentLee의 hashcode 값 : " + studentLee.hashCode());
				System.out.println("StudentSang의 hashcode 값 : " + studentSang.hashCode());
				
				// 인스턴스 전에 주어지는 실제 주소
				System.out.println("StudentLee의 실제 주소값 : " + System.identityHashCode(studentLee));
				System.out.println("StudentSang의 실제 주소값 : " + System.identityHashCode(studentSang));
				
	}
}

                