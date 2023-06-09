package week3.day1.sat;

public class Student extends College{
	
	public void studentName() {
		System.out.println("Student Name:"+" "+"Rajasekar");
	}
	public void studentDept() {
		System.out.println("Dept Name:"+" "+"ECE");
	}
	public void studentId() {
		System.out.println("Student:"+" "+"001");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student a=new Student();
		a.collegeName();
		a.collegeCode();
		a.collegeRank();
		a.studentName();
		a.studentDept();
		a.studentId();
		a.deptName();
	}
}

