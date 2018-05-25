public class VacantionBank {
    IVacantion vacantion;

    public VacantionBank(IVacantion vacantion) {
        this.vacantion = vacantion;
    }

    public void print_info(){
        this.vacantion.print_info();
    }

    public void get_count(){
        this.vacantion.get_count();
    }
}
