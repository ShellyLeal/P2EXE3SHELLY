package ita.P2EXE3SHELLY;



public class StudentControllerFactoryReflection {
	public static StudentController buildController(ControllerType controllertype) {
		StudentController controller = null;
		try {
			
			String firstLetter = controllertype.toString().substring(0, 1);
			String rest = controllertype.toString().substring(1).toLowerCase();
			Class<?> realFact = Class.forName("ita.P2EXE3SHELLY."+firstLetter+rest+"Controller");
			controller = (StudentController) realFact.newInstance();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return controller;
	}

}
