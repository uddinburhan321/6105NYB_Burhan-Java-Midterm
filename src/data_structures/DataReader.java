package data_structures;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class DataReader {

    /**
     * INSTRUCTIONS
     * <p>
     * Create an API to read the .txt file and print it to the console.
     * HINT: Use BufferedReader class
     * Use try-catch block to handle any exceptions
     * <p>
     * Store and retrieve the file to/from a database table.
     * <p>
     * After reading from file using BufferedReader API, store each word, first into a LinkedList. Each word
     * should construct a node in LinkedList. Second, do the same, but with a Stack.
     * Finally, traverse through the list\stack & retrieve each item in `FIFO` order and `FILO` order, respectively
     * <p>
     * Demonstrate how to use a stack using push, peek, search & pop methods.
     * Use For-Each & While-loop with Iterator to retrieve/print data.
     **/

    public static void main(String[] args) {
        String absPath = System.getProperty("user.dir");
        String relPath = File.separator + "src" + File.separator + "data_structures" + File.separator + "data" + File.separator + "self-driving-car";
        String textFilePath = absPath + relPath;

        File file = new File(textFilePath);

        try (FileInputStream fileInputStream = new FileInputStream(file);
             InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
             BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {

            String line;

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("NO FILE EXISTS AT THE PROVIDED PATH!");
        } catch (IOException e) {
            System.out.println("COULD NOT READ FROM FILE. PLEASE CHECK YOUR FILE IS NOT CORRUPTED");
        }

        //Storing into LinkedList
        String content = new String();
        int count = 1;
        LinkedList<String> linkedList = new LinkedList<>();
        System.out.println("\nDisplaying from LinkedList in First In First Out order: ");
        try {
            Scanner sc = new Scanner(new FileInputStream(file));
            while (sc.hasNext()) {
                content = sc.next().replaceAll("[,.!]", "");
                linkedList.add(content);
            }
            sc.close();
        } catch (FileNotFoundException fnf) {
            fnf.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("\nProgram terminated Safely...");
        }

        Iterator i = linkedList.iterator();
        while (i.hasNext()) {
            System.out.print("Node " + (count++) + " : ");
            System.out.println(i.next());
        }

        //Storing into Stack
        String content1 = new String();
        int counter = 1;
        Stack<String> myStack = new Stack<>();

        System.out.println("\nDisplaying from Stack in Last In First Out order: ");
        try {
            Scanner sc = new Scanner(new FileInputStream(file));
            while (sc.hasNext()) {
                content1 = sc.next().replaceAll("[,.!]", "");
                myStack.push(content1);
            }
            sc.close();
        } catch (FileNotFoundException fnf) {
            fnf.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("\nProgram terminated Safely...");
        }

        Collections.reverse(myStack);
        Iterator j = myStack.iterator();
        while (j.hasNext()) {
            System.out.print("Stack " + (counter++) + " : ");
            System.out.println(j.next());
        }

        System.out.println("\nThis is pop() method: " + myStack.pop());
        System.out.println("\nThis is peek() method: " + myStack.peek());
        System.out.println("\nThis is search() method: " + myStack.search("car"));
    }
}
