package dto;

public class DataTransferObject {

	public static void main(String[] args) {
		StudentBO studentBusinessObject=new StudentBO();
		for(StudentDTO student: studentBusinessObject.getAllStudents()) {
			System.out.println("Student: [RollNo: "+student.getRollNo()+", Name: "+student.getName()+"]");
		}
		StudentDTO studentToUpdate=studentBusinessObject.getAllStudents().get(0);
		studentToUpdate.setName("Michael");
		studentBusinessObject.updateStudent(studentToUpdate);
		System.out.println("Updated Student: [RollNo: "+studentToUpdate.getRollNo()+", Name: "+studentToUpdate.getName()+" ]");
	}
}
