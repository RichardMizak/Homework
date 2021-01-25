package sk.kosickaakademia.JSON.JSONParser;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
public class JSParser {

    public static void main(String[] args) {
        JSONbject obj=new JSONbject();
        JSONArray arr=new JSONArray();

        obj.put("name","Milan");
        obj.put("age",23);
        obj.put("active",true);
        arr.put("sport: hockey");
        arr.put("sport: football");
        arr.put("sport: golf");
        

        System.out.println(obj);
        System.out.println(arr);



    }
}
