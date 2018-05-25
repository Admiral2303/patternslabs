public class HeadExamination extends Examination {
    public  HeadExamination(Doctor doctor, boolean health_status){
        this.doctor = doctor;
        this.health_status = health_status;
    }

    @Override
    void showResult(boolean health_status) {
        System.out.println("Head Examination: ");
        this.doctor.showResult(health_status);
    }

}
