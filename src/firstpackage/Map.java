package firstpackage;

import java.util.*;

public class Map {

    public static void main(String[] args) {

        // Creating an empty HashMap
        java.util.Map<String, Integer> hm = new HashMap<String, Integer>();
        hm.put("a", 100);
        hm.put("b", 200);
        hm.put("c", 300);

        // Traversing through Map using for-each loop
        for (java.util.Map.Entry<String,Integer> me :
                hm.entrySet()) {
            System.out.println(me.getKey()+":" + " " + me.getValue());
        }


    }
}
