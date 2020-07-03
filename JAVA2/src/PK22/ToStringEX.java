package PK22;

class Book{
	String title;
	String author;
	
	Book(String title, String author){ // 생성자
		this.author=author;
		this.title=title;
	}
	@Override
	public String toString() {
		return title + "," + author;
	}
}



public class ToStringEX {

	public static void main(String[] args) {
		
		Book book =new Book("JAVA","홍길동"); // 생성자 호출!
		System.out.println(book);
		
		String str=new String("test");
		System.out.println(str);
		
		
	}
}
