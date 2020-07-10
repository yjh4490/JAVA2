package PK30.reduce;

import java.util.function.BinaryOperator;

//BinaryOperator는 @FunctionalInterface이다. (즉! 하난의 함수로 구현된다.)
public class CompareString implements BinaryOperator<String>{

	@Override
	public String apply(String s1, String s2) { //apply집계낼때 사용
		if(s1.getBytes().length >= s2.getBytes().length) 
			return s1;
		else return s2;
	}
	
	
	
	
	
	
	
}
