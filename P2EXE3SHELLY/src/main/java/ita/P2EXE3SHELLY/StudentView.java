package ita.P2EXE3SHELLY;
 
public class StudentView implements View{
	public void printPersonDetails(String studentName, String studentRollNo) {
		System.out.println("Student: ");
		System.out.println("Name: " + studentName);
		System.out.println("Roll No: " + studentRollNo);
	}

}
