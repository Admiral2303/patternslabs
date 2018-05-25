import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //ArrayList<Vacantion> list = new ArrayList<Vacantion>();
        VacantionBank vacantion_bank = new VacantionBank();
        vacantion_bank.add_vacantion(new IVacantion("programer", "Microsoft", "IT", "Europe"));
        vacantion_bank.add_vacantion(new IVacantion("programer", "Microsoft", "IT", "Asia"));
        vacantion_bank.print_information();
        vacantion_bank.is_region();
    }

}
