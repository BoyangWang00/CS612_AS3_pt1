public class HospitalEmployee
{
    protected String name;
    protected int number;

    //consructor
    public HospitalEmployee(){}

    //consructor with given value
    public HospitalEmployee(String input_name, int input_number){
        name = input_name;
        number = input_number;
    }

    public String getName(){
        return name;
    }

    public int getNumber(){
        return number;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public void setNumber(int newNumber){
        this.number = newNumber;
    }

    public String toString(){
        return name+" "+number;
    }

    public void work(){
        System.out.println(name + " works for the hospital.");
    }

}