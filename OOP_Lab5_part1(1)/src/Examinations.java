import java.util.ArrayList;

public class Examinations {
    private ArrayList<Examination> examinationsList = new ArrayList<Examination>();


    public void setExamination(Examination examination) {
        this.examinationsList.add(examination);
    }

    public void Execute() {
        for (Examination ex : examinationsList) {
            ex.execute();
            System.out.println("--------------");
        }
    }
}
