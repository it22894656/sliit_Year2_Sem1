package ex1;

public class Student {
	
	private int studentID;
	private String name;
	private String degree;
	private String mobile;
	
	private static int maxwhich = 100;
	
	public Student() {
		this.studentID = Student.getNextStudentID();
		this.name = "";
		this.degree = ""; 
		this.mobile = "";
	}
	public Student(String name, String degree, String mobile) {
		this.studentID = Student.getNextStudentID();
		this.name = name;
		this.degree = degree ; 
		this.mobile = mobile;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public int getID() {
		return this.studentID;
	}
	public String getName() {
		return this.name;
	}
	public String getDegree() {
		return this.degree;
	}
	public String getMobile() {
		return this.mobile;
	}
	public void print() {
		System.out.println("StdID : " + this.studentID);
		System.out.println("Name : " + this.name);
		System.out.println("Degree : " + this.degree);
		System.out.println("Mobile : " + this.mobile);
	}
	public static int getNextStudentID() {
		maxwhich += 1;
		return maxwhich;
	}
}
