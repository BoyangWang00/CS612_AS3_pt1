public class Nurse extends HospitalEmployee
{
    int numOfPatients;

    public Nurse(){}

    public Nurse(String newName, int newNumber, int newNumOfPatients){
        name = newName;
        number = newNumber;
        numOfPatients = newNumOfPatients;
    }

    public int getNumOfPatients(){
        return numOfPatients;
    }

    public void setNumOfPatients(int newNumOfPatients){
        this.numOfPatients = newNumOfPatients;
    }

    public String toString(){
        return name+number+" has "+numOfPatients+" patients.";
    }

    public void work(){
        System.out.println(name + " works for the hospital. "
                           +name+" is a nurse with "+ numOfPatients +" patients.");
    }
}