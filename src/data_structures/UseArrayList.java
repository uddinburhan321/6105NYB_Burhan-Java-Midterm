package data_structures;

import databases.SharedStepsDatabase;

import java.io.*;
import java.sql.SQLException;
import java.util.*;

public class UseArrayList {

    /**
     * INSTRUCTIONS
     * <p>
     * Demonstrate how to use an ArrayList that includes using the add, peek, remove & retrieve methods.
     * Use For-Each loop and While-loop with Iterator to retrieve the data.
     * <p>
     * Store and retrieve the data from/to a database table.
     */

    public static void main(String[] args) {

        List<String> arrayList = new ArrayList<>();

        //Adding elements to ArrayList
        System.out.println("Adding below elements into the ArrayList:");
        arrayList.add("Burhan");
        arrayList.add("Uddin");
        arrayList.add("Sam");
        System.out.println(arrayList + "\n");

        //Removing element from the ArrayList using Index
        System.out.print(arrayList.get(2));
        arrayList.remove(2);
        System.out.println(" has been removed from the arraylist: \n" + arrayList);

        //Retrieving from ArrayList
        System.out.println("\nAll the elements of ArrayList are displayed below using For-Each loop: ");
        for (String x : arrayList) {
            System.out.println(x);
        }
        System.out.println();

        //Using while loop with Iterator
        System.out.println("All the elements of ArrayList are displayed below using While loop with Iterator: ");
        Iterator arrIterator = arrayList.iterator();
        while (arrIterator.hasNext()) {
            System.out.println(arrIterator.next());
        }
        System.out.println();


        //Store and retrieve the data from/to a database table.
        SharedStepsDatabase ssdb = new SharedStepsDatabase();

        List<Object> names = new ArrayList<>();
        names.add("Burhan");
        names.add("Sam");
        names.add("Beth");
        names.add("Charles");

        ssdb.insertList("stranger", "first_name", names);

        String query = "SELECT * FROM STRANGER";

        List<String> results = null;
        try {
            results = ssdb.executeQueryReadAllSingleColumn(query, "first_name");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.println();
        System.out.println("Printing from the database: ");

        for (String s : results) {
            System.out.println(s);
        }

        ssdb.closeResources();
    }
}
