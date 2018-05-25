//strategy

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Jon", "Brown", "standart");
        TeeParty teeParty = new TeeParty();
        if(client.type == "cheap"){
            teeParty.SetTeaCeremony(new Cheapway(client));
        } else if(client.type == "standart"){
            teeParty.SetTeaCeremony(new Standartway(client));
        } else if(client.type == "expensive"){
            teeParty.SetTeaCeremony(new Expensiveway(client));
        }
        teeParty.doTeaceremony();

    }
}
