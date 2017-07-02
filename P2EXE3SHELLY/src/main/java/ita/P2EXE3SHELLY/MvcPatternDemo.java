package ita.P2EXE3SHELLY;

public class MvcPatternDemo {
	public static void main(String[] args) throws Exception {

		
				Student model1 = retriveStudentFromDatabase();
				Professor model2 = retriveProfessorFromDatabase();
				
				
				StudentView view = new StudentView();
				ProfessorView view2 = new ProfessorView();
				
				
				Factory fc = new Factory();
				Controller controller1 = fc.newController(model1, view);
				Controller controller2 = fc.newController(model2, view2);
				
				
				controller1.updateView();
				
				controller1.setName("Shelly");
				controller1.updateView();
				controller1.setRollNo("02");
				controller2.updateView();
				controller2.setName("Augusto");
				controller2.updateView();	
				controller2.setRollNo("05");
				controller2.updateView();	
			}

			static Student retriveStudentFromDatabase() {
				Student student = new Student();
				student.setName("Robert");
				student.setRollNo("10");
				return student;
			}
			static Professor retriveProfessorFromDatabase() {
				Professor prof = new Professor();
				prof.setName("Barreto");
				prof.setRollNo("01");
				return prof;
			}	
}