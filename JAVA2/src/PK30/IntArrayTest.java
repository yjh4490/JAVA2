package PK30;

import java.util.Arrays;
import java.util.stream.IntStream;


public class IntArrayTest {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		//Integer ��ȯ�ϴ� sum()�̹Ƿ� int ������ �޴´�
		int sumVal = Arrays.stream(arr).sum(); // stream�� �� �ϳ��� ���� �ۿ븸 �� �� �ִ�.
		System.out.println(sumVal);
		
		//������ �ȵǿ�!
		//int cnt = (int)stream.count();
		
		//��üȭ �Ͽ� ����� �� ����!
		IntStream stream =Arrays.stream(arr);
		int s = stream.sum();
		System.out.println(s);
		
		
		
		
		
		
		
	

	}
}