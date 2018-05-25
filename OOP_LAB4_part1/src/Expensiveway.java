public class Expensiveway extends TeaCeremony {
    public Expensiveway() {
    }
    public Expensiveway(Client client) {
        this.client = client;
    }
    @Override
    public void doTeaceremony() {
        tea_class = "very cheap tea";
        System.out.println("It's tea is very good");
    }
    @Override
    public void addClient(){
        System.out.println("Client: " + client.name + " " + client.surname + " add to expensive ceromony");
    }
    @Override
    public void getClient(){
            System.out.println("Client: " + client.name + " " + client.surname + " drink expensive tea");
    }

}
