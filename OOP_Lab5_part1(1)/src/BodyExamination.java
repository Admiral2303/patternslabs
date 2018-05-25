public class BodyExamination extends Examination {

    public BodyExamination(Doctor doctor, boolean health_status) {
        this.doctor = doctor;
        this.health_status = health_status;
    }

    @Override
    void execute() {
        System.out.println("Body Examination: ");
        if(health_status == false){
            System.out.println("The patient has problems with body");
        }
        this.doctor.showResult(health_status);
        this.doctor.bodyExamination();
    }
}
