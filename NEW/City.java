package sk.kosickaakademia.mysql;

public class City {
    private String name;
    private int population;
    private String country;
    private String code3;
    private String district;

    public City(String name,String country, String code3, String district, int population){
    this.name=name;
    this.population=population;
        this.country = country;
        this.code3 = code3;
        this.district = district;


    }

    public String getName() {
        
        return name;
    }

    public int getPopulation() {
        return population;
    }

    public String getCountry() {
        return country;
    }

    public void setCode3(String code3) {
    }

    public String getCode3() {
        return code3;
    }

    public String getDistrict() {
        return district;
    }
}
