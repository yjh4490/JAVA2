package PK29.staticex;

public class OutClass {
	
	//�ʵ�(�ν��Ͻ� ���� = ������� = �Ӽ�)
	private int num=0;
	private static int sNum=20;
	private InClass inClass; //���� Ŭ������ ����ó�� Ȱ���ϱ� ���� ����
	
	//construct�� ���ؼ� ���� Ŭ���� ��ü ����
	public OutClass() {
		System.out.println("OutClass�� ��ü�� �����Ǿ����ϴ�.");
		inClass = new InClass(); //���� Ŭ���� ����
	}
	
	class InClass{
		//���� Ŭ������ �ʵ�
		int inNum=100;
		//num +=2; // �ν��Ͻ� ���� �̹Ƿ� ����ȵ�
		/*�ܺο� �ν��Ͻ� ������ ����Ǿ� �ִ� static�� ������� ����ϴ°� ����������
		 ������ �ǰ� ������� ����ؾ� �ϴ� staticŸ���� ������ �ٸ������� ������ �Ǵ� ���� �� �� ����.*/
//		static int sNum=300;
//		static int sInNum=200; // �θ�ü���� static ��� ������ ���� ���ؼ� 
//		static void sTest() {}
		//�޼���
		void inTest() {
			System.out.println("OutClass num = "+num+"(�ܺ� Ŭ������ �ν��Ͻ� ����)");
			System.out.println("OutClass sNum = "+sNum+"(�ܺ� Ŭ������ static ����)");
			System.out.println("OutClass inNum = "+inNum+"(�ܺ� Ŭ������ �ν��Ͻ� ����)");
		}
	}
		static class InStaticClass{
			//�ʵ�
			int inNum=100;
			static int sInNum=200;
			void inTest() {
				//num = 10; //�ܺ��� �ν��Ͻ�
				System.out.println("InStaticClass inNum = " + inNum + "(���� Ŭ������ �ν��Ͻ� ���� ���)");
				System.out.println("InstaticClass sInNum = " + sInNum + "(���� Ŭ������ ����ƽ ���� ���");
				System.out.println("OutClass sNum = " + sNum + "(�ܺ� Ŭ������ ����ƽ ���� ���");
			}
			static void sTest() {
//				num+=10;
//				inNum+=10;
				sNum=30;
				System.out.println(sNum);
				System.out.println(sInNum);
					}
				}
		
		public static void main(String[] args) {
			//�ܺ� Ŭ���� ��ü ����
			OutClass outClass=new OutClass();
			System.out.println();
			
			
			//�ܺ� Ŭ������ �̿��Ͽ� ���� Ŭ���� ����
			OutClass.InClass inClass=outClass.new InClass();
			System.out.println("�ܺ� Ŭ���� ������ �̿��Ͽ� ���� Ŭ���� ����");
			inClass.inTest();
			System.out.println();
			
			//�ܺ� Ŭ���� �������� �ʰ� �ٷ� ���� ���� Ŭ���� ����
			OutClass.InStaticClass sInClass=new OutClass.InStaticClass();
			System.out.println("���� ���� Ŭ���� �Ϲ� �޼��� ȣ��");
			sInClass.inTest();
			System.out.println();
			System.out.println("���� ���� Ŭ������ ����ƽ �޼ҵ� ȣ��");
			//��ü���� ȣ��
			sInClass.sTest();
			System.out.println("���� ���� Ŭ������ ����ƽ �޼ҵ� ȣ��2");
			OutClass.InStaticClass.sTest();
			
			
			
			
			
	}
}
