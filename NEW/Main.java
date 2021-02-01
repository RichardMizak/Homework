package sk.kosickaakademia.mysql;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Database databse=new Database();
        Output out=new Output();
        String countryCode="Italy";
        databse.getCountryInfo("Italy");
        List<City> cityList=databse.getCities("");
        out.printCities(cityList);
        }

    }