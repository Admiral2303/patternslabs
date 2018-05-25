public class IVacantion implements Vacantion{
    String name;
    String company;
    String category;
    String region;

    public IVacantion(String name, String company, String category, String region) {
        this.name = name;
        this.company = company;
        this.category = category;
        this.region = region;
    }


    @Override
    public void print_information() {
        StringBuilder vacantion_inf = new StringBuilder("-----------------------------------" + "\n");
        vacantion_inf.append("Vacantion name: " + name + "\n" + "Company: " + company + "\n"
                + "Category: " + category + "\n" + "Region: " + region);
        vacantion_inf.append("\n-----------------------------------");
        System.out.println(vacantion_inf.toString());
    }

    @Override
    public int is_region(){
        if(this.region == "Europe"){
            return 1;
        } else if(this.region == "America"){
            return 2;
        } else if(this.region == "Asia"){
            return 3;
        }
        return 0;
    }

}

