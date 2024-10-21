package dto;

public class StudentDTO {

	private String name;
	private int rollNo;
	public StudentDTO(String name, int rollNo) {
		this.name=name;
		this.rollNo=rollNo;
	}
	public String getName() {
		return name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setRollNo(int rollNo) {
		this.rollNo=rollNo;
	}
}
