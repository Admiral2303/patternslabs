public abstract class DoTask {
    protected DoTask next;
    protected boolean candoHomework;

    public DoTask setNext(DoTask doTask) {
        next = doTask;
        return doTask;
    }

    public void DoTask(){
        DoHomeTask();
        if(next != null && candoHomework != true){
            next.DoTask();
        }
    }
    public void setCanDoHometask(boolean canDo){
        this.candoHomework = canDo;
    }


    abstract void DoHomeTask();
}
