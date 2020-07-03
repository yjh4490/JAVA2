package PK24;

class MyArray1 <T>{
	private Object[] array = new Object[10];
	int i;
	
	public void add(T obj) {
		array[i++]=obj;
	}
	
	public T get(int index) {
		return (T)array[index];
	}
	
	
	
}



public class GenericMyArrayTest {
	public static void main(String[] args) {
		
		
		MyArray1<String> myArray1 = new MyArray1<String>();
		myArray1.add(new String("test"));
		String str = (String)myArray1.get(0); // 강제 형변환
		System.out.println(str);
		
		
		MyArray1<Integer> myArray2 = new MyArray1<Integer>();
		myArray2.add(new Integer(100));
		
		Integer num = (Integer)myArray2.get(0); // 강제 형변환
		System.out.println(num);
		
		
	}
}
