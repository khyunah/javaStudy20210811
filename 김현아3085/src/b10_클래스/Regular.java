package b10_클래스;

public class Regular {
	
	private boolean yearCheck;

	public boolean isYearCheck() { //이냐아니냐기 때문에 is
		return yearCheck;
	}

	public void setYearCheck(int year, String schoolName) {
		this.yearCheck =year >2 && schoolName.equals("코리아아이티");
	}
	
	
	
	

}
