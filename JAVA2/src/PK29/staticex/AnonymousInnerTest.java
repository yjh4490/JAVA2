package PK29.staticex;
class Outter2{
	//�ʵ�
	int outNum=100; //�ν��Ͻ� ����
	static int sNum=200;
	
	Runnable getRunnable(int i) { //�Ű������� final�� ó�� �Ǿ� �ٸ� Ŭ�������� ������
		//�ʵ�
		int num=100; // ������������ ���ȭ final
		
		//�޼ҵ� ���ο� Ŭ���� ����
		int localnum = 10;
		
		return new Runnable() {
			
			@Override
			public void run() {
				//num=200;
				//i=20;
				System.out.println("localNum : " + localnum + "������ �ν��Ͻ� ����");
				System.out.println("outNum : " + outNum + "�ܺ� Ŭ������ �ν��Ͻ� ����");
				System.out.println("OutClass-static : " + sNum + "�ܺ� Ŭ������ ��������");
			}
 		};
	}	

		//���ο��� �۵����� ��ü!
//			Runnable runner=new Runnable() {
//				
//				@Override
//				public void run() {
//					// TODO Auto-generated method stub
//					
//				}
//			};
//
}
public class AnonymousInnerTest {
	public static void main(String[] args) {
		
		Outter2 out = new Outter2();
		Runnable runner=out.getRunnable(10);
		runner.run();
	}
}
