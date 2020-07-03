package PK22;

public class StringEqualsExample {

	public static void main(String[] args) {
		String strvar1 = new String("이호진");		
		String strvar2 = "이호진";		
		
		// 물리적 비교판단
		if(strvar1 == strvar2) {
			System.out.println("같은 String 객체를 참조하고 있구만유~");
		}
		else {
			System.out.println("다른 String 객체를 참조하고 있구만유~");
		}
		
		// 논리적 비교판단(equals 사용으로!)
		if(strvar1.equals(strvar2)) {
			System.out.println("같은 String 객체를 참조하고 있구만유~");
		}
		else {
			System.out.println("다른 String 객체를 참조하고 있구만유~");
		}
		
		
		
	}

}
