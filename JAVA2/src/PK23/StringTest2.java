package PK23;

public class StringTest2 {
	public static void main(String[] args) {
		String Javastr = new String("JAVA ");
		String androidstr = new String("and android");
		
		System.out.println(Javastr);
		System.out.println("처음 문자열 주소 값" + System.identityHashCode(Javastr));
		
		
		Javastr=Javastr.concat(androidstr);
		
		System.out.println(Javastr);
		System.out.println("연결된 문자열 주소 값" + System.identityHashCode(Javastr));
		
	}
}
