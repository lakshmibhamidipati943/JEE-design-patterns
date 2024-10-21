package mvc;
//main class

public class MVCPattern {

	public static void main(String[] args) {
		Student model=new Student();
		StudentView view=new StudentView();
		StudentController controller=new StudentController(model, view);
		controller.setStudentName("siri");
		controller.setStudentRollNo("J11014");
		controller.updateView();
		controller.setStudentName("jyothi");
		controller.updateView();
	}
}
