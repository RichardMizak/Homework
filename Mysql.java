package sk.kosickaakademia.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.concurrent.Callable;

public class Database {
    private String url="jdbc:mysql://localhost:3306/world_x";
    private String username="root";
    private String password="";

    public void showCities(String countryCode){
        String query="SELECT Name, CountryCode "+
                     "FROM city "+
                     "WHERE CountryCode LIKE ?";
try {
Class.forName("com.mysql.cj.jdbc.Driver");
    Connection conn= DriverManager.getConnection(url,username,password);
    if(conn!=null){
        System.out.println("Success");
        PreparedStatement ps= conn.prepareStatement(query);
        ps.setString(1,countryCode);
        ResultSet rs= ps.executeQuery();
        while(rs.next()){
            String city=rs.getString("Name");
            String code=rs.getString("CountryCode");
            System.out.println(city+" "+code);
        }
        conn.close();
    }
}catch (Exception e){
    e.printStackTrace();
}
    }