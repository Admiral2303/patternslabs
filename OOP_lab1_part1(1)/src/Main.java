import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Vacantion programer1 = new Vacantion("programer", "Microsoft", "IT", "Asia");
        Vacantion programer2 = new Vacantion("programer", "Google", "IT", "Asia");
        Vacantion programer3 = new Vacantion("programer", "Apple", "IT", "Europe");
        Vacantion programer4 = new Vacantion("programer", "Ring Labs", "IT", "America");
        AsiaVacantion asiaVacantion = new AsiaVacantion();
        asiaVacantion.add_vacantion(programer1);
        asiaVacantion.add_vacantion(programer2);
        EuropeVacantion europeVacantion = new EuropeVacantion();
        europeVacantion.add_vacantion(programer3);
        AmericaVacantion americaVacantion = new AmericaVacantion();
        americaVacantion.add_vacantion(programer4);


        ArrayList<VacantionBank> vacantions = new ArrayList<VacantionBank>();

        vacantions.add(new VacantionBank(asiaVacantion));
        vacantions.add(new VacantionBank(europeVacantion));
        vacantions.add(new VacantionBank(americaVacantion));

        for(VacantionBank vacantionBank: vacantions){
            vacantionBank.print_info();
        }

        for(VacantionBank vacantionBank: vacantions){
            vacantionBank.get_count();
        }
    }
}
