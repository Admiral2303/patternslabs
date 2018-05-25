

public abstract class EducationalProcess {
    public int lectures_count;
    public String practicum;
    public int practicum_count;
    public String testing;
    public int testing_count;

    public void startEducation(){
        startLectures();
        startPracticum();
        startTesting();
    }

    public abstract void startLectures();
    public abstract void startPracticum();
    public abstract void startTesting();
}
