package PK26;

import java.util.Scanner;
import java.util.Vector;

// -1�� �Էµɶ����� vector�� �ڷ�(Integer) �����ϰ� �ִ밪�� ����ϴ� �˰���

public class VectorBig {
	public static void printBig(Vector<Integer> v) {
		int big=v.get(0); //�񱳴���� �����Ƿ� ù��°�� ������ �ִ밪���� �����!!!
		
		for(int i=0; i<v.size(); i++) {
			if(big<v.get(i)) // ���⼭ for���� �� ū���� ã������ ���Ǵ� ��
				big=v.get(i);// ���Ǵܵ� ū���� big�����濡 �����ϱ�
		}
		System.out.println("���� ū ���� : " + big);
		
	}
	
	
	
	public static void main(String[] args) {
		Vector<Integer> v =new Vector<Integer>();
		//Scanner ��ü ����
		Scanner scanner = new Scanner(System.in);
		
		//�Է�
		System.out.println("������ �Է��ϼ���(-1�� �ԷµǸ� ����!)");
		while(true) {
		int S =	scanner.nextInt();
		if(S == -1) {
			break;
		}
		else
			v.add(S);
		}
		if(v.size()==0) {
			System.out.println("�Էµ� ���� �����ϴ�");
			scanner.close();
			return;
		}
		System.out.println("--���� ū��--");
		printBig(v); // ��¡ ū���� ���
		
		scanner.close();
	}

}