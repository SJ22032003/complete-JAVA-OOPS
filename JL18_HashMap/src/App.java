import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hash Map");
        try (Scanner sc = new Scanner(System.in)) {
            HashMap<String, String> map = new HashMap<>();
            map.put("1", "one");
            map.put("2", "two");
            map.put("3", "three");
            map.put("4", "four");
            map.put("5", "five");
            map.put("6", "six");

            System.out.println(map.get("3")); // returns value of key
            System.out.println(map.containsKey("4")); // true if key is present
            System.out.println(map.containsValue("nineteen")); // true if value is present
            System.out.println(map.size()); // returns size of map

            Set<String> keys = map.keySet(); // returns set of keys
            for (String in : keys) {
                System.out.println(in + ":" + map.get(in)); // prints key and value
            }

            Collection<String> values = map.values(); // returns collection of values
            for (String val : values) {
                System.out.println(val); // prints values
            }

            Set<Map.Entry<String, String>> entries = map.entrySet(); // returns set of entries
            for (Map.Entry<String, String> entry : entries) {
                System.out.println(entry.getKey() + ":" + entry.getValue()); // prints key and value
            }
        }
    }
}
