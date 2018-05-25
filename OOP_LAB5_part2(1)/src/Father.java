public class Father extends DoTask {
    public Father(){
        this.candoHomework = false;
    }
    @Override
    public void DoHomeTask() {
        if(candoHomework) {
            System.out.println("Father has done task");
        } else{
            System.out.println("Father hasn`t do this task");
        }
    }

}
