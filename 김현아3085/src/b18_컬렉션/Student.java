package b18_ÄÃ·º¼Ç;

public class Student {
	private String name;
	private int studentcode;
	
	public Student(String name, int studentcode) {
		super();
		this.name = name;
		this.studentcode = studentcode;
	}
	
	public String getName() {
		return name;
	}

	public int getStudentcode() {
		return studentcode;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", studentcode=" + studentcode + "]";
	}
	



	
	

}
