package PK29.staticex;

class Outter{
	//�ʵ�
	int outNum=100; //�ν��Ͻ� ����
	static int sNum=200;
	
	Runnable getRunnable(int i) { //�Ű������� final�� ó�� �Ǿ� �ٸ� Ŭ�������� ������
		//�ʵ�
		int num=100; // ������������ ���ȭ final
		
		//�޼ҵ� ���ο� Ŭ���� ����
	class MyRunnable implements Runnable{
		int localnum = 10;
		
		@Override
		public void run() {
			//num=200;
			//i=20;
			System.out.println("localNum : " + localnum + "������ �ν��Ͻ� ����");
			System.out.println("outNum : " + outNum + "�ܺ� Ŭ������ �ν��Ͻ� ����");
			System.out.println("OutClass-static : " + sNum + "�ܺ� Ŭ������ ��������");
			}
		}
			return new MyRunnable();
	}
}
public class LocalInnerTest {
	public static void main(String[] args) {
		
		Outter out = new Outter();
		Runnable runner=out.getRunnable(10);
		runner.run();
		

	
	}
}