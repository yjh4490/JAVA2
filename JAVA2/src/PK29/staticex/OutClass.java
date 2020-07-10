package PK29.staticex;

public class OutClass {
	
	//필드(인스턴스 변수 = 멤버변수 = 속성)
	private int num=0;
	private static int sNum=20;
	private InClass inClass; //내부 클래스를 변수처럼 활용하기 위한 선언
	
	//construct를 통해서 내부 클래스 객체 생성
	public OutClass() {
		System.out.println("OutClass가 객체가 생성되었습니다.");
		inClass = new InClass(); //내부 클래스 생성
	}
	
	class InClass{
		//내부 클래스의 필드
		int inNum=100;
		//num +=2; // 인스턴스 변수 이므로 변경안됨
		/*외부에 인스턴스 변수로 선언되어 있는 static을 변경없이 사용하는건 가능하지만
		 기준이 되고 변경없이 사용해야 하는 static타입의 변수를 다른곳에서 재정의 또는 생성 할 수 없다.*/
//		static int sNum=300;
//		static int sInNum=200; // 부모객체에서 static 사용 권한을 받지 못해서 
//		static void sTest() {}
		//메서드
		void inTest() {
			System.out.println("OutClass num = "+num+"(외부 클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum = "+sNum+"(외부 클래스의 static 변수)");
			System.out.println("OutClass inNum = "+inNum+"(외부 클래스의 인스턴스 변수)");
		}
	}
		static class InStaticClass{
			//필드
			int inNum=100;
			static int sInNum=200;
			void inTest() {
				//num = 10; //외부의 인스턴스
				System.out.println("InStaticClass inNum = " + inNum + "(내부 클래스의 인스턴스 변수 사용)");
				System.out.println("InstaticClass sInNum = " + sInNum + "(내부 클래스의 스태틱 변수 사용");
				System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수 사용");
			}
			static void sTest() {
//				num+=10;
//				inNum+=10;
				sNum=30;
				System.out.println(sNum);
				System.out.println(sInNum);
					}
				}
		
		public static void main(String[] args) {
			//외부 클래스 객체 생성
			OutClass outClass=new OutClass();
			System.out.println();
			
			
			//외부 클래스를 이용하여 내부 클래스 생성
			OutClass.InClass inClass=outClass.new InClass();
			System.out.println("외부 클래스 변수를 이용하여 내부 클래스 생성");
			inClass.inTest();
			System.out.println();
			
			//외부 클래스 생성하지 않고 바로 정적 내부 클래스 생성
			OutClass.InStaticClass sInClass=new OutClass.InStaticClass();
			System.out.println("정적 내부 클래스 일반 메서드 호출");
			sInClass.inTest();
			System.out.println();
			System.out.println("정적 내부 클래스의 스태틱 메소드 호출");
			//객체에서 호출
			sInClass.sTest();
			System.out.println("정적 내부 클래스의 스태틱 메소드 호출2");
			OutClass.InStaticClass.sTest();
			
			
			
			
			
	}
}
