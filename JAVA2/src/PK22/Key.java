package PK22;

public class Key {
	
	public int number;
	
	public Key(int number) {
		this.number=number; 
 }

	@Override
	public int hashCode() {
		return number;
		
	}
	// 내부의 내용은 객체의 hashcode값이 Object의 hashcode값과 같으면 인지함
	@Override
	public boolean equals(Object obj) {
		//부모객체와 자식객체가 형성되어서 형변환이 가능한지 판단
		if(obj instanceof Key) {
			
		//다운 캐스팅으로 obj가 Key클래스의 compareKey로 대입
		Key compareKey = (Key)obj;
		
		//this의 number와 compareKey의 number 값이 같으면 true 아니면 false
		if(number == compareKey.number)
			return true;
		}
		return false;
	}
	
	
	
}