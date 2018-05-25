public class Standartway extends TeaCeremony {
    public Standartway() {}

    public Standartway(Client client) {
        this.client = client;
    }
    @Override
    public void doTeaceremony() {
        tea_class = "very cheap tea";
        System.out.println("It's tea is good");
    }

    @Override
    public void addClient() {
        System.out.println("Client: " + client.name + " " + client.surname + " add to standart ceromony");
    }
    @Override
    public void getClient() {
        System.out.println("Client: " + client.name + " " + client.surname + "  drink good");
    }

}
