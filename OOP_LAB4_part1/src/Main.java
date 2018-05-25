public class Main {
    public static void main(String[] args) {
        Client client = new Client("Jon", "Brown");
        TeeParty teeParty = new TeeParty(client);
        teeParty.doTeaceremony();
        teeParty.SetTeaCeremony(TeeParty.TeaCost.StandartTea);
        teeParty.doTeaceremony();
        teeParty.SetTeaCeremony(TeeParty.TeaCost.ExpensiveTea);
        teeParty.doTeaceremony();
    }
}
