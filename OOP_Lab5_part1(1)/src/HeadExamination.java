public class HeadExamination extends Examination {
    public  HeadExamination(Doctor doctor, boolean health_status){
        this.doctor = doctor;
        this.health_status = health_status;
    }

    @Override
    void execute() {
        System.out.println("Head Examination: ");
        if(health_status == false){
            System.out.println("The patient has problems with head");
        }
        this.doctor.showResult(health_status);
        this.doctor.headExamination();
    }
}
