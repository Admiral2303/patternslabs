public class Main {
    public static void main(String[] args) {
        Doctor teeth_doctor = new Doctor("Jon", "Brown", "teath doctor");
        Doctor body_doctor = new Doctor("Mike", "Grey", "body doctor");
        Doctor head_doctor = new Doctor("Willian", "Nem", "head doctor");
        TeethExamination teethExamination = new TeethExamination(teeth_doctor, true);
        BodyExamination bodyExamination = new BodyExamination(body_doctor, false);
        HeadExamination headExamination= new HeadExamination(head_doctor, true);
        Patient patient = new Patient();
        Examinations examinations = new Examinations();
        patient.setExecutor(examinations, teethExamination);
        patient.setExecutor(examinations, bodyExamination);
        patient.setExecutor(examinations, headExamination);
        patient.createExamination(examinations);
    }
}
