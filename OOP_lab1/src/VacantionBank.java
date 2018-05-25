import java.util.ArrayList;

public class VacantionBank {
    private ArrayList<Vacantion> vacantion_list ;


    public VacantionBank(){
        this.vacantion_list = new ArrayList<Vacantion>();
    }



    public void add_vacantion(Vacantion vacantion){
        this.vacantion_list.add(vacantion);
    }

    public void print_information(){
        for (Vacantion b : vacantion_list) {
            b.print_information();
        }
    }

    public void is_region(){
        int europe_count = 0;
        int america_count = 0;
        int asia_count = 0;
        for (Vacantion vacantion : vacantion_list) {
            if(vacantion.is_region() == 1){
                europe_count++;
            } else if(vacantion.is_region() == 2){
                america_count++;
            } else if(vacantion.is_region() == 3){
                asia_count++;
            }
        }
        StringBuilder vacantion_inf = new StringBuilder("-----------------------------------" + "\nVacantion count\n");
        vacantion_inf.append("Europe: " + europe_count + "\n" + "America: " + america_count + "\n"
                + "Asia: " + asia_count);
        vacantion_inf.append("\n-----------------------------------");
        System.out.println(vacantion_inf.toString());
        //return 0;
    }
}
