public class Doctor {
    public String name;
    public String surname;
    public String profesion;

    public Doctor(String name, String surname, String profesion) {
        this.name = name;
        this.surname = surname;
        this.profesion = profesion;
    }

    public void showResult(boolean health_status){
        System.out.println("Doctor: " + name + " " + surname + "profecion: " + profesion);
        if(health_status){
            System.out.println("The examination is good");
        } else {
            System.out.println("The examination is bad");
        }
    }
}
