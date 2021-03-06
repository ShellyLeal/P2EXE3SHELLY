package ita.P2EXE3SHELLY;
public class StudentController implements Controller {
	private Student model;
	private StudentView view;

	public StudentController(Student model, StudentView view) {
		this.model = model;
		this.view = view;
	}
	
	public void setName(String name) {
		model.setName(name);
	}
	
	public String getName() {
		return model.getName();
	}
	
	public void setRollNo(String rollNo) {
		model.setRollNo(rollNo);
	}
	
	public String getRollNo() {
		return model.getRollNo();
	}
	
	public void updateView() {
		view.printPersonDetails(model.getName(), model.getRollNo());
	}

}