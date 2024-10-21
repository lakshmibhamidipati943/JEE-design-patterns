package dao;

public class DaoPatternDemo {

	public static void main(String[] args) {
		StudentDao studentDao=new StudentDaoImpl();
		for(Student student: studentDao.getAllStudents()) {
			System.out.println("Student: [Roll No: "+student.getRollNo()+", Name: "+student.getName()+" ]");
		}
		Student studentToUpdate=studentDao.getAllStudents().get(0);
		studentToUpdate.setName("Michael");
		studentDao.updateStudent(studentToUpdate);
		System.out.println("Updated Student: [Roll No: "+ studentToUpdate.getRollNo()+", Name: "+studentToUpdate.getName()+ " ]");
		studentDao.deleteStudent(studentToUpdate);
		System.out.println("Remaining Students: ");
		for(Student student: studentDao.getAllStudents()) {
			System.out.println("Student: [Roll No: "+ student.getRollNo()+", Name: "+student.getName()+" ]");
		}
	}
}
