package PK26.arraylist;

import java.util.List;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		
		List<Board> list=new Vector<Board>();
//		Board board1 = new Board("����1","����1","������1");
//		Board board1 = new Board("����2","����2","������2");
//		Board board1 = new Board("����3","����3","������3");
//		Board board1 = new Board("����4","����4","������4");
//		Board board1 = new Board("����5","����5","������5");
		
		list.add(new Board("subject1", "content1", "writer1"));
		list.add(new Board("subject2", "content2", "writer2"));
		list.add(new Board("subject3", "content3", "writer3"));
		list.add(new Board("subject4", "content4", "writer4"));
		list.add(new Board("subject5", "content5", "writer5"));
		
		for (int i = 0; i < list.size(); i++) {
			Board board=list.get(i);
			System.out.println(board.subject + "\t" + board.content + "\t" + board.writer);
		}
		
		System.out.println("================================");
		
		list.remove(2);
		list.remove(3);
		
		for (int i = 0; i < list.size(); i++) {
			Board board=list.get(i);
			System.out.println(board.subject + "\t" + board.content + "\t" + board.writer);
		}
		
		
		
		
	}
}