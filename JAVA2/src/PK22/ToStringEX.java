package PK22;

class Book{
	String title;
	String author;
	
	Book(String title, String author){ // ������
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
		
		Book book =new Book("JAVA","ȫ�浿"); // ������ ȣ��!
		System.out.println(book);
		
		String str=new String("test");
		System.out.println(str);
		
		
	}
}
