package PK24;


public class GenericMethod {
	
	public static <T,V> double markeRectangle(Point<T,V> p1,Point<T,V> p2) {
		double left =((Number)p1.getx()).doubleValue(); 	//���� T���� ����
		double right =((Number)p2.getx()).doubleValue(); 	//������ T���� ����
		double top =((Number)p1.gety()).doubleValue(); 		//���� T���� ����
		double bottom =((Number)p2.gety()).doubleValue(); 	//�Ʒ��� T���� ����
		
		
		double width=right-left;
		double height=bottom-top;
		
		return width*height;
	}
	
	
	
	
	public static void main(String[] args) {
		
	Point<Integer, Double> p1=new Point<Integer, Double>(0,0.0); 	// X��ǥ
	Point<Integer, Double> p2=new Point<>(10,10.0);	// y��ǥ
		
		
	double rect=GenericMethod.<Integer, Double>markeRectangle(p1, p2);
	System.out.println("�� ������ ������� �簢���� ���̴� " + rect + "�Դϴ�. ");
	
	}
}
