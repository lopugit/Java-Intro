
public class UniDriver {
	public static void main(String []args) {
		Uni newUni = new Uni();
		Unit newUnit = new Unit("OODI", "FIT2099");
		
		newUni.printStatus();
		
		newUni.createUnits();
		
		newUnit.description();
		
		newUni.displayUnits();
	}
}

