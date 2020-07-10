package PK30.lambda;

public class TestStringConcat {

	public static void main(String[] args) {

		String s1="Hello";
		String s2="world";
	
		// 객체지향방식
		StringConcatImpl str = new StringConcatImpl();
		str.makeString("객체지향 방식 : " + s1, s2);
		
		// 람다식(구현부 생략)
		StringConcat concat2=(r,v)->System.out.println(r+" "+v);
		concat2.makeString("람다식 방식 : " + s1, s2);
		
		
		
		// 익명의 클래스
		StringConcat concat3=new StringConcat() {
			
			@Override
			public void makeString(String s1, String s2) {
				System.out.println("익명의클래스 : "+s1+" "+s2);
			}
		};
			concat3.makeString(s1,s2);
		
	}
}