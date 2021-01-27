package sk.kosickaakademia.JSON;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class JSParser2 {
    public static void main(String[] args) {
        JSONParser p=new JSONParser();
        try{
            Reader r=new FileReader("resource/json1.json");
            JSONObject o=(JSONObject) p.parse(r);
            JSONArray data=(JSONArray) o.get("data");
            for(int i=0;i<data.size();i++){
                JSONObject temp=(JSONObject) data.get(i);
                String city=(String) temp.get("city");
                String wikiDataID=(String) temp.get("wikiDataId");
                String region=(String) temp.get("region");
                System.out.println("City: "+city);
                System.out.println("Region: "+region);
                System.out.println("Wiki Data: "+wikiDataID);
                double latitude=(double) temp.get("latitude");
                double longitude=(double) temp.get("longitude");
                System.out.println("Latitude : "+latitude);
                System.out.println("Longitude: "+longitude);
            }
        }catch(IOException e){
            e.printStackTrace();
        }catch(org.json.simple.parser.ParseException e){
            e.printStackTrace();
    }
}
}
