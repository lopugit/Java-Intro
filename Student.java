
public class Student {

	private String studentId;
	
	// Set givenName and familyName variables because some people have multiple names
	private String givenName;
	private String familyName;
	
	public Student(String newStudentId){
		
		this.studentId = newStudentId;
		
	}
	
	public Student(String newStudentId, String newGivenName, String newFamilyName){
		
		this.studentId = newStudentId;
		this.givenName = newGivenName;
		this.familyName = newFamilyName;
		
	}

	public void setGivenName(String newGivenName){
		
		this.givenName = newGivenName;
		
	}
	

	public void setFamilyName(String newFamilyName){
		
		this.familyName = newFamilyName;
		
	}
}
