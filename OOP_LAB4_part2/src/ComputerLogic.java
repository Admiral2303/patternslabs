public class ComputerLogic extends EducationalProcess {
    public ComputerLogic(){
        this.lectures_count = 30;
        this.practicum = "Lab Works";
        this.practicum_count = 5;
        this.testing = "Exam";
        this.testing_count = 8;
    }
    @Override
    public void startLectures() {
        StringBuilder lectures_inf = new StringBuilder("-----------------------------------" + "\n");
        lectures_inf.append("Subject: Computer Logic" + "\n");
        lectures_inf.append("Lectures count: " + this.lectures_count );
        lectures_inf.append("\n-----------------------------------");
        System.out.println(lectures_inf.toString());
    }

    @Override
    public void startPracticum() {
        StringBuilder practicum_inf = new StringBuilder("-----------------------------------" + "\n");
        practicum_inf.append("Subject: Computer Logic" + "\n");
        practicum_inf.append("Practicum type: " + this.practicum + "\n");
        practicum_inf.append("Practicum count: " + this.practicum_count );
        practicum_inf.append("\n-----------------------------------");
        System.out.println(practicum_inf.toString());
    }

    @Override
    public void startTesting() {
        StringBuilder testing_inf = new StringBuilder("-----------------------------------" + "\n");
        testing_inf.append("Subject: Computer Logic" + "\n");
        testing_inf.append("Testing type: " + this.testing + "\n");
        testing_inf.append("Testing count: " + this.testing_count );
        testing_inf.append("\n-----------------------------------");
        System.out.println(testing_inf.toString());
    }
}
