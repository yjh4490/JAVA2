package PK29.staticex;

public class Student {
	// 인스턴스 변수
	public static int serialNum = 1000; //데이터 영역에 별도로 생성
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public Student() {
		serialNum++;
		studentID=serialNum;
	}
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String name) {
		
		studentName=name;
	}
	
	//static 메소드
	public static int getSerialNum() {
		int i=10; //지역변수(stack메모리): 메소드가 종료되면 같이 없어짐!
		//studentName="aaa";(heap메모리)
		//serialNum++; // (Data)
		return serialNum;
	}
	
	public static void setSerialNum(int serialNum) {
		Student.serialNum=serialNum;
	}
	
}
