public class Cheapway extends TeaCeremony {
    public Cheapway() {
    }
    public Cheapway(Client client) {
        this.client = client;
    }

    @Override
    public void doTeaceremony() {
        tea_class = "very cheap tea";
        System.out.println("It's tea is very bad");
    }
    @Override
    public void addClient(){
        System.out.println("Client: " + client.name + " " + client.surname + " add to cheap ceromony");
    }
    @Override
    public void getClient(){
            System.out.println("Client: " + client.name + " " + client.surname + " drink tea in bags");
    }

}
