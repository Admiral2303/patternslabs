public abstract class Examination {
    Doctor doctor;
    protected Examination next;
    protected boolean health_status;

    public Examination setNext(Examination examination) {
        next = examination;
        return examination;
    }

    public void show_operation(){
        showResult(health_status);
        if(next != null){
            next.show_operation();
        }
    }

    public void setDoctor(Doctor doctor){
        this.doctor = doctor;
    }

    public void setHealthStatus(boolean healthStatus){
        this.health_status = healthStatus;
    }

    abstract void showResult(boolean health_status);
}
