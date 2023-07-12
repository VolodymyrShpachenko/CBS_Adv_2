import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex2 <E>{
    public List <E> doubleValues (List<E> list) {
        List<E> result = new ArrayList<>();
        for (E l : list) {
            result.add(l);
            result.add(l);
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "one two three four five";
        String [] ar = s.split(" ");
        List <String> list = new Ex2<String>().doubleValues(Arrays.asList(ar));
        for (String st : list) {
            System.out.println(st);
        }
    }
}
