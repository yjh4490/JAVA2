package PK26;

import java.util.Scanner;
import java.util.Vector;

// -1이 입력될때까지 vector에 자료(Integer) 저장하고 최대값을 출력하는 알고리즘

public class VectorBig {
	public static void printBig(Vector<Integer> v) {
		int big=v.get(0); //비교대상이 없으므로 첫번째는 무조건 최대값으로 저장됨!!!
		
		for(int i=0; i<v.size(); i++) {
			if(big<v.get(i)) // 여기서 for문은 더 큰수를 찾기위해 비교판단 함
				big=v.get(i);// 비교판단된 큰수를 big변수방에 저장하기
		}
		System.out.println("가장 큰 수는 : " + big);
		
	}
	
	
	
	public static void main(String[] args) {
		Vector<Integer> v =new Vector<Integer>();
		//Scanner 객체 생성
		Scanner scanner = new Scanner(System.in);
		
		//입력
		System.out.println("정수를 입력하세요(-1이 입력되면 종료!)");
		while(true) {
		int S =	scanner.nextInt();
		if(S == -1) {
			break;
		}
		else
			v.add(S);
		}
		if(v.size()==0) {
			System.out.println("입력된 수가 없습니다");
			scanner.close();
			return;
		}
		System.out.println("--가장 큰수--");
		printBig(v); // 가징 큰수를 출력
		
		scanner.close();
	}

}