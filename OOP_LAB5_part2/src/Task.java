import java.util.ArrayList;

public class Task {
    private String name;
    private ArrayList<Executor> executorsList = new ArrayList<Executor>();

    public String getName() {
        return name;
    }

    public void set_Executor(Executor executor) {
        this.executorsList.add(executor);
    }

    public int Execute() {
        int mark = -1;
        for (Executor ex : executorsList) {
            mark = ex.DoHomeTask();
            if (mark != -1) {
                return mark;
            }
        }
        System.out.println("Pupil has done task for 2 points");
        return 2;

    }
}
