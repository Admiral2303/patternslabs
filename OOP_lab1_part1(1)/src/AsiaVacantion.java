import java.util.ArrayList;

public class AsiaVacantion implements IVacantion {
    ArrayList<Vacantion> vacantions = new ArrayList<Vacantion>();

    public void add_vacantion(Vacantion vacantion){
        if(vacantion.getRegion() == "Asia") {
            vacantions.add(vacantion);
        }
    }

    @Override
    public void print_info() {
        for(Vacantion vacantion: vacantions){
            StringBuilder vacantion_inf = new StringBuilder("-----------------------------------" + "\n");
            vacantion_inf.append("Asia Vacantion" + "\n");
            vacantion_inf.append("Vacantion name: " + vacantion.getName() + "\n" + "Company: " + vacantion.getCompany() + "\n"
                    + "Category: " + vacantion.getCategory() );
            vacantion_inf.append("\n-----------------------------------");
            System.out.println(vacantion_inf.toString());
        }
    }

    @Override
    public void get_count() {
        System.out.println("Asia Vacantion bank has " + vacantions.size() + " vacantions");
       // return vacantions.size();
    }
}
