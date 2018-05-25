public class TeeParty {

    public enum TeaCost{
        CheapTea,
        StandartTea,
        ExpensiveTea
    }
    Cheapway cheapway;
    Standartway standartway;
    Expensiveway expensiveway;
    private TeaCeremony teaCeremony;
    public TeeParty(Client client){
        cheapway = new Cheapway(client);
        standartway = new Standartway(client);
        expensiveway = new Expensiveway(client);
        teaCeremony = cheapway;
    }

    public TeeParty(){
        teaCeremony = cheapway;
    }

    public void SetTeaCeremony(TeaCost state){
        if(state == TeaCost.CheapTea){
            teaCeremony = cheapway;
        } else if(state == TeaCost.StandartTea){
            teaCeremony = standartway;
        } else if(state == TeaCost.ExpensiveTea){
            teaCeremony = expensiveway;
        }
    }
    public void doTeaceremony(){
        teaCeremony.doTeaceremony();
    }
    public void getClient(){
        teaCeremony.getClient();
    }
}
