package PK30.lambda;


interface PrintString{
	
	void showString(String str);
}


public class TestLambda {

	public static void main(String[] args) {
		//  람다식을 변수에 대입
		PrintString lambdaStr = a->System.out.println(a);
		lambdaStr.showString("hello lambda_1");
		
		//  함수형 람다 유형1 -> 함수형 람다식은 꼭 구현부가 있어야 함!!
		showMyString(lambdaStr); 
		//a->System.out.println(a); 복사되어 lambdaStr에 담겨있음
		
		//  함수형 람다 유형2
		PrintString reStr=returnString();
		reStr.showString("hello");
		
	}
	public static void showMyString(PrintString p) {
		p.showString("hello lambda_2");
	}
	
	public static PrintString returnString() {
		return a->System.out.println(a + " world");
	}
	
	
}
