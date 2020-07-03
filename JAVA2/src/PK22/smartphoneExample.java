package PK22;


public class smartphoneExample {

	public static void main(String[] args) {

		Smartphone myphone;
		
		Smartphone myPhone=new Smartphone("삼성","안드로이드");
		
		//System.out.println(myPhone); //hashcode
		String strObj = myPhone.toString();
		
		System.out.println(strObj);
	}
}
