public class Patient {
    public void setExecutor(Examinations ex, Examination e) {
        ex.setExamination(e);
    }

    public void createExamination(Examinations ex) {
        ex.Execute();
    }
}
