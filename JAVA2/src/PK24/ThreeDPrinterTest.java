package PK24;
//java 1.5���� �Ϲ�(not ���׸�)
public class ThreeDPrinterTest {

	public static void main(String[] args) {
		
	
		ThreeDPrinter printer=new ThreeDPrinter();
		
		Powder p1 =new Powder();
		printer.setMaterial(p1);
		
		// �ٿ� ĳ����
		Powder p2 = (Powder)printer.getMaterial();
		System.out.println(p2);
	}

}
