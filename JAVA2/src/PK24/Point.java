package PK24;

public class Point<T,V> {

	T x;	//int x;
	V y;	//double y;
	
	Point(T x,V y){
		this.x=x;
		this.y=y;
		
	}
	
	public T getx() {
		return x;
	}
	public V gety() {
		return y;
	}
}
