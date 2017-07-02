package ita.P2EXE3SHELLY;


public class StudentControllerFactory {
	public static StudentController buildController(ControllerType controller) {
        StudentController student = null;
        switch (controller) {
        case Controller1:
        	student = new FirstController();
            break;
 
        case Controller2:
        	student = new SecondController();
            break;
 
        case Controller3:
        	student = new ThirdController();
            break;
 
        default:
            // throw some exception
            break;
        }
        return student;
    }
}
