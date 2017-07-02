package ita.P2EXE3SHELLY;

public class ProfessorController implements Controller {
	private Professor model;
	private ProfessorView view;
	public ProfessorController(Professor model, ProfessorView view) {
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
