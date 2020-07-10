package PK30.lambda;

public class TestAdd {

	public static void main(String[] args) {
		
		
		Add addF=(x,y)->x+y; // 구현부  실행부에서 참조할때 .. 이름이 아니라 무작정으로 같은 속성을 데려옴!!!!
							 // 람다식은 딱 한개의 연산자(함수만) 구현할 수 있음		
		System.out.println(addF.add(3, 5)); // 실행부
		
	}
}