package basic.String;

import java.util.*;


public class str_expert {

    public static void main(String[] args) {

        Map<String, String> objMap = new HashMap<String, String>();

        objMap.put("Name", "Biswajit");
        objMap.put("MCA", "2nd year");
        objMap.put("age", "24");

        System.out.println(objMap);
        // objMap.remove("2nd year");
        System.out.println(objMap.containsValue("26"));
        System.out.println(objMap.get("2nd year"));
        System.out.println(objMap.keySet() + "  " + objMap.values());
    }
}
