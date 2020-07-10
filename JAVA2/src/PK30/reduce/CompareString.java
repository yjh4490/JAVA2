package PK30.reduce;

import java.util.function.BinaryOperator;

//BinaryOperator�� @FunctionalInterface�̴�. (��! �ϳ��� �Լ��� �����ȴ�.)
public class CompareString implements BinaryOperator<String>{

	@Override
	public String apply(String s1, String s2) { //apply���賾�� ���
		if(s1.getBytes().length >= s2.getBytes().length) 
			return s1;
		else return s2;
	}
	
	
	
	
	
	
	
}
