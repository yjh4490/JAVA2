package PK26.arraylist;

import java.util.Stack;

public class StackExample {
	public static void main(String[] args) {
		Stack<Coin> coinBox=new Stack<Coin>();
		
		//4���̻� push
		if(coinBox.empty()) {
			for (int i = 0; i < 5; i++) {
				
			}	
		}
		coinBox.push(new Coin(300));
		coinBox.push(new Coin(800));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(100));
		//coin�� ���������� �ݺ��Ͽ� pop�ϱ�
		//while�� ���
		while(!coinBox.isEmpty()) {
			Coin coin = coinBox.pop();
			System.out.println("���� ���� : " + coin.getValue() + "��");
		}
		
 


}
}