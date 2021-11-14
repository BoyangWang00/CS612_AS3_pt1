public class Surgeon extends Doctor
{

    private boolean operating;

    public Surgeon(){}

    public Surgeon(String newName, int newNumber, String newSpecialty, boolean inOperating){
        name = newName;
        number = newNumber;
        specialty = newSpecialty;
        operating = inOperating;
    }

    public String toString(){
        return name+"    "+number+"  "+specialty+"Operating: "+operating;
    }

    public void work(){
        if (operating){
            System.out.println(name + " works for the hospital. "
                               +name+" is operating now.");
        } else {
            System.out.println(name + " works for the hospital. "
                               +name+" is not operating now.");
        }
    }

}