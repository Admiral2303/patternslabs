public class Main {
    public static void main(String[] args) {
        Composite Group_KP61 = new Composite("KP-61");
        Composite Group_KP62 = new Composite("KP-62");
        Student Yarik = new Student("Yarik");
        Yarik.addMark(5);
        Yarik.addMark(4);
        Student Maks = new Student("Maks");
        Maks.addMark(5);
        Maks.addMark(5);
        Group_KP61.add(Yarik);
        Group_KP61.add(Maks);
        Group_KP62.add(Yarik);
        Group_KP62.add(Maks);
        Composite Flow_KP = new Composite("KP");
        Flow_KP.add(Group_KP61);
        Flow_KP.add(Group_KP62);
        Composite Flow_KM = new Composite("KP");
        Flow_KM.add(Group_KP61);
        Flow_KM.add(Group_KP62);
        Composite Course2 = new Composite("Second course");
        Course2.add(Flow_KM);
        Course2.add(Flow_KP);
        Composite Course1 = new Composite("First course");
        Course1.add(Flow_KM);
        Course1.add(Flow_KP);
        Composite Fpm = new Composite("Fpm");
        Fpm.add(Course1);
        Fpm.add(Course2);
        Fpm.display_info();
        //Flow_KP.display_info();
        //KP61.display_student_info();
       System.out.println(Fpm.student_ratting());


    }
}
