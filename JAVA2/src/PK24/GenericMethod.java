package PK24;


public class GenericMethod {
	
	public static <T,V> double markeRectangle(Point<T,V> p1,Point<T,V> p2) {
		double left =((Number)p1.getx()).doubleValue(); 	//왼쪽 T에서 받음
		double right =((Number)p2.getx()).doubleValue(); 	//오른쪽 T에서 받음
		double top =((Number)p1.gety()).doubleValue(); 		//위쪽 T에서 받음
		double bottom =((Number)p2.gety()).doubleValue(); 	//아래쪽 T에서 받음
		
		
		double width=right-left;
		double height=bottom-top;
		
		return width*height;
	}
	
	
	
	
	public static void main(String[] args) {
		
	Point<Integer, Double> p1=new Point<Integer, Double>(0,0.0); 	// X좌표
	Point<Integer, Double> p2=new Point<>(10,10.0);	// y좌표
		
		
	double rect=GenericMethod.<Integer, Double>markeRectangle(p1, p2);
	System.out.println("두 점으로 만들어진 사각형의 넓이는 " + rect + "입니다. ");
	
	}
}
