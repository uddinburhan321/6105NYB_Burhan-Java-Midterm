package data_structures;

import databases.SharedStepsDatabase;

import java.sql.SQLException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

public class UseQueue {

    /** INSTRUCTIONS
     *
     * Demonstrate how to use Queue that includes add, peek, remove & poll methods.
     * Use For-Each loop and While-Loop with Iterator to retrieve data.
     *
     * Store and retrieve data from/to a database table.
     */


    public static void main(String[] args) {

        SharedStepsDatabase ssdb = new SharedStepsDatabase();
        Queue<Object> myQueue = new ArrayDeque<>();

        myQueue.add("Viktoryia");
        myQueue.add("Chebrine");
        myQueue.add("Fatema");

        for (Object s : myQueue) {
            System.out.println(s);
        }

        ssdb.insertQueue("student", "first_name", myQueue);

        String query = "SELECT * FROM STUDENT";

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

        System.out.println();
        System.out.println("Executing poll() method: " + myQueue.poll());
        System.out.println("\nExecuting peek() method: " + myQueue.peek());
        System.out.println("\nExecuting remove() method: " + myQueue.remove());

    }

}
