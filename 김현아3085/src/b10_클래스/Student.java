package b10_클래스;

public class Student {
	
	private String name ;
	private String schoolName;
	private int year; //학년
	
	public Student(String name, int year) {
		super(); 		
		this.name = name; 
		this.year = year;
		this.showInfo();
	}	
	public Student(String name, String schoolName, int year) {
		super(); //상속 관계
		this.name = name; //디스는 내클래스안에 라는 의미 
		this.schoolName = schoolName;
		this.year = year;
		this.showInfo();
	}
	
	public  Student() { //기본생성자, 오버로딩할때 반드시 필요,  디폴트로는 사용불가, 생성자는 거의 public
		
	}
	 	 
	public void setName(String name) {
		 this.name = name + " 학생";  //이것이 캡슐화  디스라고 해준거는 네임이 똑같아서 다르게 보여줄려고 붙여준것		 
	}
	 
	public String getName() {// get : 이 클래스가 가지고 있는 값을 가지고 오기위한 것
		 return name;
	}
	
	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public void getFreebies() {
		
		Regular regular  = new Regular();	
		regular.setYearCheck(year, schoolName);
		
		if(regular.isYearCheck()) {
			System.out.println("사은품 대상자");
		}else {
			System.out.println("대상자 제외");
		}
	}

	public void showInfo () {
		System.out.println("학생 정보");
		System.out.println("이름 : "+name);
		System.out.println("학교 : "+ schoolName);
		System.out.println("학년 : "+year);
	}	
}

