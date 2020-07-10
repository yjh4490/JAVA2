package PK26;

public class Student {
	//필드 (private)
	private String name;
	private String department;
	private String number;
	private double grade;
	
	//생성자
	public Student(String name, String department, String number, double grade) {
		this.name=name; this.department=department; this.number=number; this.grade=grade;
	}

	public String getName() {
		return name;
	}

	public String getDepartment() {
		return department;
	}

	public String getNumber() {
		return number;
	}

	public double getGrade() {
		return grade;
	}
	public void find_student(String name) {
		if(name.equals(this.name))
		System.out.println(this.name + "," + this.department + "," + this.number + "," + this.grade);
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", department=" + department + ", number=" + number + ", grade=" + grade + "]";
	}
	
}
