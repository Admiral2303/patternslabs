public class Pupil {
    public void SetExecutor(Task t, Executor e)
    {
        t.set_Executor(e);
    }
    public void ExecuteTaskByHimself(Task t)
    {
        t.Execute();
    }
}
