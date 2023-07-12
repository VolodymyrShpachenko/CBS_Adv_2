import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListMakerEx5 {
    public void listMaker () {
        Scanner scanner = new Scanner(System.in);
        List<String> list= new ArrayList<>();
        String word = "";
        while (true) {
            System.out.println("Enter next word.");
            word = scanner.next();
            if (word.equalsIgnoreCase("end")) {break;}
            list.add(word);
        }
        System.out.println("You have finished typing.");
        for (String w : list) {
            System.out.println(w);
        }

    }
}
