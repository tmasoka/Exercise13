import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionsFile {
    public static void main(String[] args) throws IOException {
        List<String> students = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("src/Students.txt"))) {

            String line;
            while ((line = br.readLine()) != null) {
                students.add(line);

            }
        } catch (IOException es) {
           es.printStackTrace();
        }

        System.out.println("The size of this collection is: " + students.size());

        //standard For Loop
        System.out.println("**************For Loop************");
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
        //For Each Loop
        System.out.println("****************For Each***************");
        for (String student : students){
            System.out.println(student);
        }
    // Iterator Interface
        System.out.println("*************Iterator Interface************");
        Iterator<String> itr  = students.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
