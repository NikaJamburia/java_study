package nika;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;


public class Main {

    public static void main(String[] args) {
        HashMap<String, String> capitals = new HashMap<>();
        capitals.put("Georgia", "Tbilisi");
        capitals.put("England", "London");
        capitals.put("Russia", "Moscow");

        map_to_json(capitals, "src/map.json");

    }

    public static void map_to_json( HashMap<String, String> map, String path){

        String result = "{ \n";
        for(String i : map.keySet()){
            result += "\"" + i + "\"" + ":  " +  "\"" + map.get(i) + "\"" + "," + "\n";
        }
        result += "}";

        StringBuilder b = new StringBuilder(result);
        b.replace(result.length()-3, result.length()-2, "");

        System.out.println(b);

        try(PrintWriter out = new PrintWriter(path) ) {
            out.write(b.toString());
        }
        catch (IOException e){
            System.out.println(e);
        }

    }
}