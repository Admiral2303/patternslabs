import java.util.ArrayList;

public class NodeControl extends AddNode {
    ArrayList<Integer> forbiden_adress = new ArrayList<Integer>(){{
        add(0);
        add(13);
        add(5);
    }};

    Server server = new Server();
    @Override
    public void enter_node(Node n) {
        int address = n.get_adress();
        boolean is_forbiden = false;
        for(int k : forbiden_adress){
            if(k == address){
                is_forbiden = true;
                break;
            }
        }
        if(is_forbiden == true){
            System.out.println("Node has forbiden adress: " + address);
        } else {
            server.enter_node(n);
        }
    }
}
