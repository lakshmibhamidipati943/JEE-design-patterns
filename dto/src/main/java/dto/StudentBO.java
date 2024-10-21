package dto;

import java.util.ArrayList;
import java.util.List;

public class StudentBO {

	private List<StudentDTO> students;
	public StudentBO(){
		students=new ArrayList<>();
		students.add(new StudentDTO("Robert",0));
		students.add(new StudentDTO("John",1));
	}
	public List<StudentDTO> getAllStudents(){
		return students;
	}
	public void updateStudent(StudentDTO student) {
		students.get(student.getRollNo()).setName(student.getName());
		System.out.println("Student: Roll No "+student.getRollNo()+", updated in the database");
	}
}
