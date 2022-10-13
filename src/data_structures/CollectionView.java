package data_structures;

import java.util.HashMap;
import java.util.Map;

public class CollectionView {

    /**
     * INSTRUCTIONS
     * <p>
     * A map is given to you below, with some data inserted into it.
     * <p>
     * Retrieve the Collection view of the values present in map
     */

    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(5, "San Jose");
        map.put(6, "Seattle");
        map.put(2, "LA");
        map.put(4, "Boston");
        map.put(1, "NYC");
        map.put(3, "Denver");

        String text = "KEYS\t" + "VALUES";
        String utxt = String.join("\u0332", text.split("", -1));
        System.out.println(utxt);
        System.out.println("");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " \t\t" + entry.getValue());
        }

    }

}
