import java.util.*;

public class Unit {

	private String unitName;
	private String unitCode;
	private ArrayList<Student> students;
	
	public Unit(String un, String uc) {
		
		this.unitName = un;
		this.unitCode = uc;

	}
	
	public String description() {
		
		return this.unitName + " " + this.unitCode;
		
	}
	
	public void enrolStudent(Student newStudent) {
		
		this.students.add(newStudent);
		
	}
	
}

