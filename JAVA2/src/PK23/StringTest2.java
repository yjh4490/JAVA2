package PK23;

public class StringTest2 {
	public static void main(String[] args) {
		String Javastr = new String("JAVA ");
		String androidstr = new String("and android");
		
		System.out.println(Javastr);
		System.out.println("ó�� ���ڿ� �ּ� ��" + System.identityHashCode(Javastr));
		
		
		Javastr=Javastr.concat(androidstr);
		
		System.out.println(Javastr);
		System.out.println("����� ���ڿ� �ּ� ��" + System.identityHashCode(Javastr));
		
	}
}
