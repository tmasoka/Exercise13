import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Task2 {
    public static void main(String[] args) throws IOException {
        HashSet<String> Cars = new HashSet<String>();
        try (BufferedReader br = new BufferedReader(new FileReader("src/Cars.txt"))) {

            String line;
            while ((line = br.readLine()) != null) {
                Cars.add(line);

            }
        } catch (IOException es) {
            es.printStackTrace();
        }

        System.out.println("The size of this collection is: " + Cars.size());

        //standard For Loop
        System.out.println("**************For Loop************");
        for (String i : Cars) {
             System.out.println(i);
        }
        //For Each Loop
        System.out.println("****************For Each***************");
        for (String car : Cars){
            System.out.println(car);
        }
        // Iterator Interface
        System.out.println("*************Iterator Interface************");
        Iterator<String> itr  = Cars.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
