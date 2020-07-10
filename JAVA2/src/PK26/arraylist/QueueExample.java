package PK26.arraylist;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
	public static void main(String[] args) {
		
		Queue<Message> messageQueue=new LinkedList<Message>();
		
		messageQueue.offer(new Message("sendMail", "ȫ�浿"));
		messageQueue.offer(new Message("sendSMS", "�Ӳ���"));
		messageQueue.offer(new Message("sendKaKaotalk", "ȫ�α�"));
		//empty : �񵿱�ȭ�� �����ϸ鼭 ����ִ� ���� 0���� true�� ��ȯ
		//isEmpty: ����ȭ�� �����ϸ� null�� ���� (��! ��ü�� �� �����Ƿ� ���������null������ �ʱ�ȭ��)
		while(!messageQueue.isEmpty()) {
			Message message=messageQueue.poll();
			switch(message.command) {
			case "sendMail" :
				System.out.println(message.to + "�Կ��� Mall�� �����ϴ�.");
				break; 
			case "sendSMS" :
				System.out.println(message.to + "�Կ��� SMS�� �����ϴ�.");
				break;
			case "sendKaKaotalk" :
				System.out.println(message.to + "�Կ��� KaKaotalk�� �����ϴ�.");
				break;
			}
		}
				
		
		
		
		
		
		
		
		
	}
}