package data_structures;

import databases.SharedStepsDatabase;

import java.sql.SQLException;
import java.util.*;

public class UseMap {

    /**
     * INSTRUCTIONS
     * <p>
     * Implement code to demonstrate how to interact with a database connection, using a Map
     * You must insert the map into a table, and then you must submit & execute a query to retrieve
     * all the submitted data (retrieval does not need to be stored as a map - you can use any data structure)
     * <p>
     * Use For-Each loop and While-loop with Iterator to retrieve data.
     */

    public static void main(String[] args) throws Exception {

        HashMap<Object, Object> map = new HashMap<>();
        map.put(8454, "lamia");
        map.put(4567, "azar");
        map.put(7898, "rahim");

        // Retrieving "Keys" & "Values" using an Iterator
        Iterator<Object> mapIter = map.keySet().iterator();
        Object key;
        String text = "KEYS\t" + "VALUES";
        String utxt = String.join("\u0332", text.split("", -1));
        System.out.println(utxt);

        while (mapIter.hasNext()) {
            key = mapIter.next();
            System.out.print(key + "\t");
            System.out.print(map.get(key));
            System.out.println("\n");
        }

        String tableName = "`test_hash_map`";

        SharedStepsDatabase sql = new SharedStepsDatabase();

        // IMPLEMENT HERE

        sql.insertMap(tableName, map);

        String query = "SELECT * FROM TEST_HASH_MAP";

        List<List<String>> results = null;
        try {
            results = sql.executeQueryReadAll(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.println();
        System.out.println("Printing from the database: \n");
        System.out.println("All the elements of HashMap are displayed below using For-Each loop: ");

        for (List s : results) {
            System.out.println(s);
        }

        System.out.println("\nAll the elements of HashMap are displayed below using While loop with Iterator: ");
        Iterator arrIterator = results.iterator();
        while (arrIterator.hasNext()) {
            System.out.println(arrIterator.next());
        }

        sql.closeResources();

    }
}
