package PK23;

import java.util.StringTokenizer;


public class stTokenizer {

	public static void main(String[] args) {
		String str="Have a Nice Day";
		
		/*StringTokenzier
		(자르고 싶은 문자열, 자르는 기준문자의 집합, 자르는 기준을 넣을지 말지)*/
		
		
		StringTokenizer obj =new StringTokenizer(str," ",false);

// StringTokenizer.hasMoreTokens() - Token들이 저장되어 있는 배열
		while(obj.hasMoreTokens()) {
		String t=obj.nextToken();
		System.out.println(t);
		
	}
		
		
		
		
	}
}
