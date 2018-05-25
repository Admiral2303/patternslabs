public class Granny extends DoTask{
    public Granny(){
        this.candoHomework = false;
    }
    @Override
    public void DoHomeTask() {
        if(candoHomework) {
            System.out.println("Granny has done task");
        } else{
            System.out.println("Granny hasn`t do this task");
        }
    }

}
