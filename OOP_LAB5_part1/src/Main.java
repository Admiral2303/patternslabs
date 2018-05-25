//

public class Main {
    public static void main(String[] args) {
        Examination teath, body, head;
        Doctor teath_doctor = new Doctor("Jon", "Brown", "teath doctor");
        Doctor body_doctor = new Doctor("Mike", "Grey", "body doctor");
        Doctor head_doctor = new Doctor("Willian", "Nem", "had doctor");
        teath = new TeathExamination(teath_doctor, true);
//        body = new BodyExamination(body_doctor);
//        head = new HeadExamination(head_doctor);
        teath.setHealthStatus(true);
//        body.setHealthStatus(false);
//        head.setHealthStatus(true);
        body = teath.setNext(new BodyExamination(body_doctor, true));
        head = body.setNext(new HeadExamination(head_doctor, false));

        teath.show_operation();
    }
}
