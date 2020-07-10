package PK30.stream;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayStream {

	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,5};
		Arrays.stream(arr).forEach(n->System.out.print(n));
		System.out.println();
		
		int sum=Arrays.stream(arr).sum();
		System.out.println("합계 : " + sum);
		System.out.println();
		
		//객체이름 : list
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		//list.stream().map(a->a.length()).forEach(a->System.out.print(a+" "));
		
	}

}
