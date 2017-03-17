import java.util.*;

public class Uni {
    
	private ArrayList<Unit> Units;
		
	public Uni(){
		
	}
	
	public void printStatus() {
        System.out.println("Welcome to Java University");
        System.out.println();
        System.out.println("Thank you for using Java University");		
        

    } 
    
    public void createUnits(){
    	
    	Unit unit1 = new Unit("FIT2099","OODI");
    	Unit unit2 = new Unit("FIT2004","SSWE");
    	Unit unit3 = new Unit("FIT2008","PAMA");
    	
    	Student nikolajFrey = new Student("27874079", "Nikolaj", "Frey");
    	Student peterMcleor = new Student("27840243", "Peter", "Mcleor");
    	Student michealMore = new Student("20285312", "Micheal", "More");
    	
    	unit1.enrolStudent(nikolajFrey);
    	unit2.enrolStudent(peterMcleor);
    	unit3.enrolStudent(michealMore);
    	
    	this.Units.add(unit1);
    	this.Units.add(unit2);
    	this.Units.add(unit3);
    	
    }
    
    public void displayUnits(){
    	
    		for (int i = 0; i < this.Units.size(); i++) {

    			System.out.println(Units.get(i).description());
    	    		
    		}
    	
    	
    	
    }
}

