public class TeeParty {


    private TeaCeremony teaCeremony;

    public void SetTeaCeremony(TeaCeremony teaceremony){
        teaCeremony = teaceremony;
    }
    public void doTeaceremony(){
        teaCeremony.doTeaceremony();
    }
    public void getClient(){
        teaCeremony.getClient();
    }
}
