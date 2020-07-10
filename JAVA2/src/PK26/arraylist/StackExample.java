package PK26.arraylist;

import java.util.Stack;

public class StackExample {
	public static void main(String[] args) {
		Stack<Coin> coinBox=new Stack<Coin>();
		
		//4번이상 push
		if(coinBox.empty()) {
			for (int i = 0; i < 5; i++) {
				
			}	
		}
		coinBox.push(new Coin(300));
		coinBox.push(new Coin(800));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(100));
		//coin이 없을때까지 반복하여 pop하기
		//while문 사용
		while(!coinBox.isEmpty()) {
			Coin coin = coinBox.pop();
			System.out.println("꺼낸 동전 : " + coin.getValue() + "원");
		}
		
 


}
}