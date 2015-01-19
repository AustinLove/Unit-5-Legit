package unit.pkg5;


public class Task {
    private String name;
    private String descrip;

    public Task(String name, String descrip) {
        this.name = name;
        this.descrip = descrip;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }
    public boolean validate(){
        if(name == null || descrip == null || name.equals("")||descrip.equals(""))
            return false;
        else
            return true;
    }
    public String toString() {
        return "Task{" + "name=" + name + ", description=" + descrip + '}';
    }
    
}
