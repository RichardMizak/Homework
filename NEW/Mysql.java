package sk.kosickaakademia.mysql;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class Database {
    private String url="jdbc:mysql://localhost:3306/world_x";
    private String username="root";
    private String password="";

    public List<City> getCities(String countryCode){
        String query="SELECT city.Name, JSON_EXTRACT(Info,'$Population') AS Population "+
                     "FROM city "+
                     "INNER JOIN country ON country.code = city.CountryCode "+
                     "WHERE country.name LIKE ? ORDER BY Population DESC";
        List<City> cityList=new ArrayList<>();
try {
    Connection conn = getConnection();
    if(conn!=null){
        System.out.println("Success");
        PreparedStatement ps= conn.prepareStatement(query);
        System.out.println(ps);
        ps.setString(1,countryCode);
        ResultSet rs= ps.executeQuery();
        while(rs.next()){
            String name=rs.getString("Name");
         // String code=rs.getString("CountryCode");
            int pop=rs.getInt("Population");
            City city=new City(name,pop);
            cityList.add(city);

        }
        conn.close();
    }
}catch (Exception e){
    e.printStackTrace();
}
return cityList;
    }

    private Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn= DriverManager.getConnection(url,username,password);
        return conn;
    }

    public Country getCountryInfo(String country){
        String query="SELECT country.name, country.code, city.name "+
                     "FROM country "+
                     "INNER JOIN city ON country.Capital = city.ID "+
                     "WHERE country.name LIKE ?";
        Country countryInfo=null;
        try {
            Connection con=getConnection();
            PreparedStatement ps=con.prepareStatement(query);
            ps.setString(1, country);
            ResultSet rs= ps.executeQuery();
            if (rs.next()){
                String code3= rs.getString("country.code");
                String capital= rs.getString("city.name");
                System.out.println(capital+" "+code3);
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        return countryInfo;
    }
}