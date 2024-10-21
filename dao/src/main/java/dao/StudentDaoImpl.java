package dao;

import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao{

	private List<Student> students;
	public StudentDaoImpl() {
		students=new ArrayList<>();
		students.add(new Student("Robert",0));
		students.add(new Student("John",1));
	}
	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		
		return students;
	}

	@Override
	public Student getStudent(int rollNo) {
		// TODO Auto-generated method stub
		return students.get(rollNo);
	}

	@Override
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		students.get(student.getRollNo()).setName(student.getName());
		System.out.println("Student: Roll No "+student.getRollNo() + ", updated in the database");
	}

	@Override
	public void deleteStudent(Student student) {
		// TODO Auto-generated method stub
		students.remove(student.getRollNo());
		System.out.println("Student: Roll No "+ student.getRollNo()+", deleted from database");
	}
	

}
