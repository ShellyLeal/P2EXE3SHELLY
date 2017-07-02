package ita.P2EXE3SHELLY;


public class Factory {

	public Controller newController(Model model, View view) throws Exception{
		
		if(model.getClass().getName().equals("ita.P2EXE3SHELLY.Student")&&view.getClass().getName().equals("ita.P2EXE3SHELLY.StudentView")){

			return new StudentController((Student) model,(StudentView) view);
		}
		
		if(model.getClass().getName().equals("ita.P2EXE3SHELLY.Professor")&&view.getClass().getName().equals("ita.P2EXE3SHELLY.ProfessorView")){
			return new ProfessorController((Professor) model,(ProfessorView) view);
		}		
		
		throw new Exception();
	}
}
