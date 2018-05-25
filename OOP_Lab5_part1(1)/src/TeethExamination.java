public class TeethExamination extends Examination {

    public  TeethExamination(Doctor doctor, boolean health_status){
        this.doctor = doctor;
        this.health_status = health_status;
    }

    @Override
    void execute() {
        System.out.println("Teeth Examination: ");
        if(health_status == false){
            System.out.println("The patient has problems with teeth");
        }
        this.doctor.showResult(health_status);
        this.doctor.teethExamination();
    }

}
