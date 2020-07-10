package PK26.arraylist;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
	public static void main(String[] args) {
		
		Queue<Message> messageQueue=new LinkedList<Message>();
		
		messageQueue.offer(new Message("sendMail", "홍길동"));
		messageQueue.offer(new Message("sendSMS", "임꺽정"));
		messageQueue.offer(new Message("sendKaKaotalk", "홍두깨"));
		//empty : 비동기화를 제공하면서 비어있는 공간 0으로 true값 반환
		//isEmpty: 동기화를 제공하며 null값 인지 (즉! 객체가 들어가 있으므로 비어있으면null값으로 초기화됨)
		while(!messageQueue.isEmpty()) {
			Message message=messageQueue.poll();
			switch(message.command) {
			case "sendMail" :
				System.out.println(message.to + "님에게 Mall을 보냅니다.");
				break; 
			case "sendSMS" :
				System.out.println(message.to + "님에게 SMS를 보냅니다.");
				break;
			case "sendKaKaotalk" :
				System.out.println(message.to + "님에게 KaKaotalk을 보냅니다.");
				break;
			}
		}
				
		
		
		
		
		
		
		
		
	}
}