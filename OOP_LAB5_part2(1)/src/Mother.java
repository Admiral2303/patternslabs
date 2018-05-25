public class Mother extends  DoTask{
    public Mother(){
        this.candoHomework = false;
    }
    @Override
    public void DoHomeTask() {
        if(candoHomework) {
            System.out.println("Mother has done task");
        } else{
            System.out.println("Mother hasn`t do this task");
        }
    }
}
