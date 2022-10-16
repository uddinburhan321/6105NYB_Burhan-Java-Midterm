package xml;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.*;

import javax.xml.parsers.ParserConfigurationException;

import databases.SharedStepsDatabase;
import org.xml.sax.SAXException;


public class ProcessStudentInfo {

    /**
     * INSTRUCTIONS
     * Take a look at the XmlReader class, found within this package. Try to understand what the parseData() method
     * is doing. This is essential to figuring out how to implement the remainder of this exercise.
     * <p>
     * In that XmlReader class, you need to implement the method called "convertIntToChar()" which should convert the
     * student number scores into corresponding letter grades:
     * 90 - 100 = 'A'
     * 80 - 89  = 'B'
     * 70 - 79  = 'C'
     * <p>
     * Here, in the main method, extend the code that is written and meant to get you started. You must parse the
     * students' information contained within the XML files into 2 separate ArrayList's (One for Selenium students and
     * the other for QTP Students) and then store those lists into the provided HashMap
     * <p>
     * Then, you must use a combination of an iterator and a while-loop to print out the stored data.
     * Your output should be formatted EXACTLY like the example below:
     * ......................................................
     * Student ID: 1
     * First Name: Ibrahim
     * Last Name:  Khan
     * GRADE:      B
     * <p>
     * Student ID: 2
     * First Name: Asif
     * Last Name:  Roni
     * GRADE:      A
     * <p>
     * Student ID: 3
     * First Name: Asif
     * Last Name:  Roni
     * GRADE:      C
     * ......................................................
     * <p>
     * Finally, you must store all student data into a database table, called `selenium_students`
     * Use any database (MongoDB, Oracle MySQL, PostgreSQL) to store and retrieve data.
     **/

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException, SQLException {

        // To get you started, your system's abs path has been initialized and some add'l variables have been declared
        String systemPath = System.getProperty("user.dir");
        String seleniumDocRelativePath = File.separator + "src" + File.separator + "xml" + File.separator + "data" + File.separator + "selenium.xml";
        String qtpDocRelativePath = File.separator + "src" + File.separator + "xml" + File.separator + "data" + File.separator + "qtp.xml";
        String seleniumDocPath = systemPath + seleniumDocRelativePath;
        String qtpDocPath = systemPath + qtpDocRelativePath;
        String tag = "id";

        /*
         Here is a map that you'll be using to store 2 lists. One will contain Selenium students, the other will
         contain QTP students
         */

        // Implement the rest below, as per the instructions

        XmlReader xmlReader = new XmlReader();
        //xmlReader.parseData(tag, seleniumDocPath);

        List<Student> seleniumStudent = new ArrayList<>();
        for (Student std : xmlReader.parseData(tag, seleniumDocPath)) {
            seleniumStudent.add(std);
        }

        /*Map<Object, Object> seleniumStudents = new HashMap<>();
        for (Student s : seleniumStudent) {
            //seleniumStudents.put(s.firstName, s.score);
            seleniumStudents.put(s.id, s.firstName);
            seleniumStudents.put(s.lastName, s.score);
        }*/


        /*Map<String, List<Student>> studentMap = new LinkedHashMap<String, List<Student>>();

        for (Map.Entry<String, List<Student>> entry : studentMap.entrySet()) {

            Iterator sTuDent = studentMap.entrySet().iterator();
            while (sTuDent.hasNext()) {
                System.out.println(sTuDent.next());

            }
            for (Student key : seleniumStudent) {
                if (!studentMap.containsKey(key)) {
                    studentMap.put(tag, entry.getValue());
                }
                Student Student = null;
                studentMap.get(key).add(Student);
            }

            System.out.println(entry.getKey() + "values" + entry.getValue());
            System.out.println("hello" + studentMap.keySet());

            studentMap.put(tag, seleniumStudent);
            System.out.println(entry.getKey() + ": " + entry.getValue());
            //studentMap.get(item.getKey()).add(item.getValue());
            System.out.println("Hey there! I'm inside for loop");
        }
        System.out.println("Hey there! I'm outside for loop");*/




        /*SharedStepsDatabase ssdb = new SharedStepsDatabase();

        //insert into database
        ssdb.insertMap("selenium_students", seleniumStudents);
        String query = "SELECT * FROM selenium_students";
        System.out.println(ssdb.executeQueryReadAll(query));*/

    }
}
