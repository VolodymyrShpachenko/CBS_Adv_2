import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CityReturnerEx4 {
    public void cityReturner () {
        Map<String, String> map = new HashMap<>();
        map.put("Москва", "Іванови");
        map.put("Київ", "Петрови");
        map.put("Лондон", "Абрамовичі");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the city");
        String key = scanner.next();
        System.out.println(map.get(key));
    }
}
