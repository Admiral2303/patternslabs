public class Granny extends Executor {
    public Granny(){
        this.candoHomework = false;
    }
    @Override
    public int DoHomeTask() {
        if (candoHomework) {
            System.out.println("Granny has done task for 5 points");
            return 5;
        } else {
            return -1;
        }
    }

    public void setCanDoHometask(boolean canDo){
        this.candoHomework = canDo;
    }
}
