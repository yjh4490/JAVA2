package PK26.arraylist;

import java.util.Vector;

public class VetorTest {
	public static void main(String[] args) {
		
		Object obj;
		// 크기2의 배열 선언
		Vector<Object> vec = new Vector<Object>(2);
		
		obj=10;
		vec.addElement(obj); // 엘리먼트 추가
		System.out.println(" 용량#1 : " + vec.capacity());	//vector 용량 수
		System.out.println(" 크기 #1 : " + vec.size());		//vector 엘리먼트 수
		
		obj="Hi";
		vec.addElement(obj); // 엘리먼트 추가
		System.out.println(" 용량#2 : " + vec.capacity());
		System.out.println(" 크기#2 : " + vec.size());
		
		obj="Nice Day";
		vec.addElement(obj); // 엘리먼트 추가
		System.out.println(" 용량#3 : " + vec.capacity());
		System.out.println(" 크기#3 : " + vec.size());
		
		
		
		
	}
}
