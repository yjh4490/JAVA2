package PK30.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStream {
	public static void main(String[] args) {
		List<String> sList = new ArrayList<String>();
		
		sList.add("Tomas");
		sList.add("Edward");
		sList.add("Hall");
		
		// ���׸� Ÿ���� stream���� 
		Stream<String> stream = sList.stream();
		
		//���ٽ� ��� : �ϳ��� ���(Element)�� ������ ����س��� ���ٽ�
		stream.forEach(s->System.out.print(s+" "));
		System.out.println();
		
		sList.stream().sorted().forEach(s->System.out.print(s+" "));
		System.out.println();
		
		sList.stream().filter(s->s.length()>=5).forEach(s->System.out.print(s+" "));
		System.out.println();
		
		sList.stream().map(s->s.length()).forEach(s->System.out.print(s+" "));
		 
//		for(String s : sList) {
//			System.out.println(s);
//		}
		

		
		
		
	}		
}	