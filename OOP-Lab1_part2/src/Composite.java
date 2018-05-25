import java.util.ArrayList;

public class Composite implements Component {
    String name;
    ArrayList<Component> array;

    public Composite(String name) {
        this.name = name;
        this.array = new ArrayList<Component>();
    }

    @Override
    public void add(Component c) {
        array.add(c);
    }

    @Override
    public void remove(Component c) {
        array.remove(c);
    }

    @Override
    public void display_info() {
        System.out.println("Name :" + this.name + "\n" +
                "Contains: " + array.size() + "objects");
        System.out.println("\n");
    }

    @Override
    public double student_ratting() {
        double ratting = 0.0;
        for (Component s : array) {
            ratting += s.student_ratting();
        }
        return ratting / (double) array.size();
    }
}





