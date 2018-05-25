//Comand

public class Main {
    public static void main(String[] args) {
        Mother m = new Mother();

        Father f = new Father();
        f.setCanDoHometask(true);
        Granny g = new Granny();
        Pupil pupil = new Pupil();
        Task task = new Task();
        pupil.SetExecutor(task, m);
        pupil.SetExecutor(task, f);
        pupil.ExecuteTaskByHimself(task);

    }
}
