public class TeathExamination extends Examination {
    public  TeathExamination(Doctor doctor, boolean health_status){
        this.doctor = doctor;
        this.health_status = health_status;
    }

    @Override
    void showResult(boolean health_status) {
        System.out.println("Teath Examination: ");
        this.doctor.showResult(health_status);
    }


}
