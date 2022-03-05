package Collections.Map.HashMap;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String,String> country = new HashMap<>();

        country.put("TR","Türkiye");
        country.put("GE","Almanya");
        country.put("EN","İngiltere");
        country.put("US","Amerika");

        System.out.println(country.get("TR"));

        for(String countryKeys : country.keySet()){
            System.out.println(countryKeys);
        }

        System.out.println("**********************");

        for (String countryValues : country.values()){
            System.out.println(countryValues);
        }


    }
}
