public class Doctor {
    public String name;
    public String surname;
    public String profession;

    public Doctor(String name, String surname, String profession) {
        this.name = name;
        this.surname = surname;
        this.profession = profession;
    }


    public void headExamination(){
        System.out.println("Doctor " + name + " "  + surname + " conducts head examination: ");
    }
    public void bodyExamination(){
        System.out.println("Doctor " + name + " "  + surname + " conducts body examination: ");
    }
    public void teethExamination(){
        System.out.println("Doctor " + name + " "  + surname + " conducts teeth examination: ");
    }

    public void showResult(boolean health_status){
        System.out.println("Doctor: " + name + " " + surname + " profession: " + profession);
        if(health_status){
            System.out.println("The examination is good");
        } else {
            System.out.println("The examination is bad");
        }
    }
}
