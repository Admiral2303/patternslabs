public class Server extends AddNode {
    /*String name;
    public Server(String name) {
        this.name = name;
    }*/

    @Override
    public void enter_node(Node n) {
        System.out.println("New node " + n.get_adress() + " added to the server");
    }
}
