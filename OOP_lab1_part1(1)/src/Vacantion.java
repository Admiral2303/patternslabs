public class Vacantion {
    private String name;
    private String company;
    private String category;
    private String region;

    public Vacantion(String name, String company, String category,String region) {
        this.name = name;
        this.company = company;
        this.category = category;
        this.region = region;
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public String getCategory() {
        return category;
    }

    public String getRegion() {
        return region;
    }



}
