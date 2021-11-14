public class Doctor extends HospitalEmployee
{
    protected String specialty;

    public Doctor(){}

    public Doctor(String newName, int newNumber, String newSpecialty){
        name = newName;
        number = newNumber;
        specialty = newSpecialty;
    }

    public String getSpecialty(){
        return specialty;
    }

    public void setSpecialty(String newSpecialty){
        this.specialty = newSpecialty;
    }

    public String toString(){
        return name+"    "+number+"  "+specialty;
    }

    public void work(){
        System.out.println(name + " works for the hospital. "
                           +name+" is a(n) "+ specialty +" doctor.");
    }

}