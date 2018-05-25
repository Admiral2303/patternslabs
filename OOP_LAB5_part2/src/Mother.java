public class Mother extends Executor {
    public Mother(){
        this.candoHomework = false;
    }
    @Override
    public int DoHomeTask() {
        if (candoHomework) {
            System.out.println("Mother has done task for 4 points");
            return 4;
        } else {
            return -1;
        }
    }
    public void setCanDoHometask(boolean canDo){
        this.candoHomework = canDo;
    }
}
