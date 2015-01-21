package unit.pkg5;

public class Patient {
	
	

    String name;
    String priority;

    public Patient(String name, int priority) {
        this.name = name;
        switch (priority) {
            case 0:
                this.priority = "Critical";
                break;
            case 1:
                this.priority = "Serious";
                break;
            case 2:
                this.priority = "Fair";
                break;
            default:
                this.priority = "Unknown";
                break;
        }
    }

    @Override
    public String toString() {
        String temp = name + " (Condition: " + priority + " )";
        return temp;
    }

}
