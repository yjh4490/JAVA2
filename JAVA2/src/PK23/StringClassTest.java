package PK23;

import java.lang.reflect.*;
 


public class StringClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
		Class strClass=Class.forName("java.lang.String");
		
		Constructor[] cons = strClass.getConstructors();
		for(Constructor c:cons) {
			System.out.println(c);
		}
		System.out.println("====================");
		
		Method[] meth = strClass.getMethods();
		for (Method m : meth) {
			System.out.println(m);
		}
		System.out.println("====================");
		
		Field[] fields=strClass.getFields();
		for (Field f : fields) {
			System.out.println(f);
		}
		System.out.println("====================");
		
		
	}
}
