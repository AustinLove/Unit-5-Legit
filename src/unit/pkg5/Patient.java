package unit.pkg5;

public class Patient {
	
	static String name, cond, treat;
	static boolean treated;
	
	public Patient(String nm, String stat, boolean t){
		name = nm;
		cond = stat;
		treated = t;
	}
	private String Treated(){
	if (treated == true) treat = " has been treated ";
	else if (treated == false) treat = "waiting....";
	return treat;
	}
	
	public void isTreated(boolean t){
		treated = t;
		Treated();
	}
	public String priority(){
		return cond;
	}
	
	public String toString() {
		String str = name + "\t ";
		str += cond + " \t";
		str += Treated() + "\n";
		return str;
	}
	

}
