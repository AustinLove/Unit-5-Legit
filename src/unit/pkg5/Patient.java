
package unit.pkg5;


public class Patient {
	private String name,status;
	
	public Patient(String nm, String stat){
		name=nm;
		status = stat;
	}
	public String toString(){
		return "Name: " + name + "\t\tStatus: " + status+"\n";
	}
}
