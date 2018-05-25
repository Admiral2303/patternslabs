public class Father extends Executor {
    public Father(){
        this.candoHomework = false;
    }
    @Override
    public int DoHomeTask() {
        if(candoHomework) {
            System.out.println("Father has done task for 3 points");
            return 3;
        } else{
            return -1;
        }
    }
    public void setCanDoHometask(boolean canDo){
        this.candoHomework = canDo;
    }
}
