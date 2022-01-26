import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hash Set");
        try (Scanner sc = new Scanner(System.in)) {
            HashSet<Integer> hs = new HashSet<>();
            hs.add(1);
            hs.add(76);
            hs.add(22);
            hs.add(43);
            hs.add(11);

            hs.contains(22);// true if object is present in the set
            hs.size();// returns the size of the set
            hs.remove(22);// removes the object from the set
            hs.isEmpty();// returns true if the set is empty
            hs.clear();// removes all the elements from the set
            hs.toArray();// returns an array of the set
            hs.toString();// returns the string representation of the set

        }
    }
}