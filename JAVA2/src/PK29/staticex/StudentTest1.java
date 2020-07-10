package PK29.staticex;

public class StudentTest1 {
	public static void main(String[] args) {

		Student studentLee=new Student();
		studentLee.setStudentName("이지원");
		//System.out.println(studentLee.serialNum); // Student에서 설정한 시리얼넘버 초깃값 출력(1000)
		//studentLee.serialNum++; // 시리얼 넘버 사용후 다음 사용시 추가시키기!
		System.out.println("성명 : " + studentLee.studentName + "학번: " + studentLee.studentID);
		
		//static의 set메소드 또는 변경을 주면 안된다!!!(단, static에서 static값을 받았을때는 가능)
		//System.out.println(Student.setSerialNum(1005));
		System.out.println(Student.getSerialNum());
		
		Student studentSon=new Student();
		studentSon.setStudentName("손수경");
		//System.out.println(studentSon.serialNum); // Student에서 설정한 초깃값 출력
		System.out.println("성명 : " + studentSon.studentName + "학번: " + studentSon.studentID);
		
		
	}
}