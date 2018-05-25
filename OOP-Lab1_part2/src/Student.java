import java.util.ArrayList;

public class Student implements Component {
    protected String name;
    ArrayList<Integer> marks;

    public Student(String name){
        this.name = name;
        this.marks = new ArrayList<Integer>();
    }
    public void addMark(int mark){
        this.marks.add(mark);
    }

    @Override
    public void add(Component s) {
        System.out.println("Unused operation");
    }

    @Override
    public void remove(Component s) {
        System.out.println("Unused operation");
    }

    @Override
    public void display_info() {
        System.out.println("Student name: " + name );
        System.out.println("Student marks: ");
        for(int mark: marks){
            System.out.println(mark + ",");
        }
    }

    @Override
    public double student_ratting() {
        int ratting = 0;
        for (int mark: this.marks) {
            ratting += mark;
        }
        return (double)ratting / (double)marks.size();
    }
}
