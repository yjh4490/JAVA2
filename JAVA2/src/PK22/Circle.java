package PK22;

public class Circle implements Cloneable{
	
	
	Point point;
	int radius;
	
	Circle(int x, int y, int radius){
		point = new Point(x,y);
		this.radius=radius;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		return "������" + point + "�̰�," + "��������" + radius + "�Դϴ�";
	}
	
	
	
	
}
