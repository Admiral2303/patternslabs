public class Main {
    public static void main(String[] args) {
        DoTask m, f, g, p;
        m = new Mother();
        f = m.setNext(new Father());
        f.setCanDoHometask(true);
        g = f.setNext(new Granny());
        p = g.setNext(new Pupil());
        m.DoTask();


    }
}
